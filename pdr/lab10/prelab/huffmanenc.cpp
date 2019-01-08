//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: huffmanenc.cpp
//Date:11/25/2018

// included so we can use cout
#include <iostream>
// stdlib.h is where exit() lives
#include <stdlib.h>

using namespace std;

// include the standard I/O library
#include <stdio.h>

#include "heap.h"
#include "huffmanNode.h"

// we want to use parameters
int main (int argc, char **argv) {
    // verify the correct number of parameters
	if ( argc != 2 ) {
		cout << "Must supply the input file name as the one and only parameter" << endl;
		exit(1);
	}
    // attempt to open the supplied file.  FILE is a type desgined to
    // hold file pointers.  The first parameter to fopen() is the
    // filename.  The second parameter is the mode -- "r" means it
    // will read from the file.
	FILE *fp = fopen(argv[1], "r");
    // if the file wasn't found, output and error message and exit
	if ( fp == NULL ) {
		cout << "File '" << argv[1] << "' does not exist!" << endl;
		exit(2);
	}
    // read in each character, one by one.  Note that the fgetc() will
    // read in a single character from a file, and returns EOF when it
    // reaches the end of a file.
	int characterFreq[128];
	for(int i=0;i<128;i++){
		characterFreq[i]=0;
	}
	int tSymbols = 0;
	int dSymbols = 0;
	char g;
	while ( (g = fgetc(fp)) != EOF ){
		if((int)g >= 32 && int(g) < 127){
			tSymbols++;
			characterFreq[int (g)]++;
		}
	}
	heap minHeap;
	for(int i=0;i<128;i++){   
	    if(characterFreq[i]>0){
	    	huffmanNode* node = new huffmanNode(characterFreq[i], (char) i );
	    	//cout<<"inserting: "<<node->getch()<<" "<<node->getFreq()<<endl;
	    	minHeap.insert(node);
	    	dSymbols++;
	    }		
	}
	heap huffTree = minHeap.createHuffmanTree(minHeap);
	//cout<<"new heap: "<<minHeap.findMin()->getch()<<minHeap.findMin()->getFreq()<<endl;
	huffTree.printHuffmanCode(huffTree.findMin(),"");
	huffTree.setHuffmanCode(huffTree.findMin(),"");
    // a nice pretty separator
	cout << "----------------------------------------" << endl;
    // rewinds the file pointer, so that it starts reading the file
    // again from the begnning
    vector<huffmanNode*> codedVec = minHeap.getVectorHeap();
	rewind(fp);
	int original = 0;
	int compressed = 0;
    // read the file again, and print to the screen
	while ( (g = fgetc(fp)) != EOF ){
		for(int i=1;i<=minHeap.getSize();i++){
			if(codedVec[i]->getch()==g){
				cout<<codedVec[i]->gethuffmanCode()<< " ";
				original += 8;
				string cod = codedVec[i]->gethuffmanCode();
				for(int c=0;c<cod.length();c++){
					compressed +=1;
				}
			}
		}
	}
	cout<<endl;
	cout << "----------------------------------------" << endl;

	cout<<"There are a total of "<<tSymbols<<" symbols that are encoded.\n";
	cout<<"There are "<<dSymbols<<" distinct symbols used.\n";
	cout<<"There were "<<original<<" bits in the original file.\n";
	cout<<"There were "<<compressed<<" bits in the compressed file.\n";
	double ratio = (double) original/compressed;
	cout<<"This gives a compression ratio of "<<ratio<<".\n";
	double cost = (double) compressed/tSymbols;
	cout<<"This cost of the Huffman tree is "<<cost<<" bits per character."<<endl; 
    // close the file
	fclose(fp);
}

