//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: huffmandec.cpp
//Date:11/27/2018

// NOTE: This program used and modified the skeleton code for the lab 10 in-lab.

#include <iostream>
#include <fstream>
#include <sstream>
#include <stdlib.h>
#include "huffmanNode.h"
#include <string>
using namespace std;

void createHuffmanTree(huffmanNode* node, string prefix, char ch){ //used to creata huffman tree
    if(prefix.length()==0){
        node->ch=ch;
    }
    if(prefix[0]=='0'){
        if(node->left==NULL){
            node->left = new huffmanNode(0,'-');
        }
        createHuffmanTree(node->left, prefix.substr(1), ch);
    }
    if(prefix[0]=='1'){
         if(node->right==NULL){
            node->right = new huffmanNode(0,'-');
        }
        createHuffmanTree(node->right, prefix.substr(1), ch);
    }
}
void printHuffman(huffmanNode* root, huffmanNode* node, string prefix){ //used to print the decoded message
    for(int i=0;i<prefix.length();i++){
        if(prefix[i]=='0'){
            if(node->left!=NULL)
                node = node->left;
        }
        if(prefix[i]=='1'){
            if(node->right!=NULL)
                node = node->right;
        }
        if(node->left==NULL && node->right==NULL){
            cout<<node->ch;
            node = root;
        }
    }
}
// main(): we want to use parameters
int main (int argc, char **argv) {
    // verify the correct number of parameters
    if ( argc != 2 ) {
        cout << "Must supply the input file name as the only parameter" << endl;
        exit(1);
    }
    // attempt to open the supplied file; must be opened in binary
    // mode, as otherwise whitespace is discarded
    ifstream file(argv[1], ifstream::binary);
    // report any problems opening the file and then exit
    if ( !file.is_open() ) {
        cout << "Unable to open file '" << argv[1] << "'." << endl;
        exit(2);
    }
    huffmanNode* root = new huffmanNode(0,'-'); //used as root for huffman tree
    // read in the first section of the file: the prefix codes
    while ( true ) {
        string character, prefix;
        // read in the first token on the line
        file >> character;
        // did we hit the separator?
        if ( (character[0] == '-') && (character.length() > 1) )
            break;
        // check for space
        if ( character == "space" )
            character = " ";
        // read in the prefix code
        file >> prefix;

        createHuffmanTree(root, prefix, character[0]);
    }
    // read in the second section of the file: the encoded message
    string answer = "";
    stringstream sstm;
    while ( true ) {
        string bits;
        // read in the next set of 1's and 0's
        file >> bits;
        // check for the separator
        if ( bits[0] == '-' )
            break;
        // add it to the stringstream
        sstm << bits;
    }
    string allbits = sstm.str();
    printHuffman(root,root,allbits); //for each set of 1's and 0's, print their decoded message
    cout<<endl; //used to flush stream
    // close the file before exiting
    file.close();
    delete root;
}