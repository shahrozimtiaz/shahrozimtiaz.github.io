//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: heap.h
//Date:11/25/2018

//*NOTE: Some heap code was taken from the lecture slides and modified*

//ORIGINAL CODE:
// written by Aaron Bloomfield, 2014
// Released under a CC BY-SA license
// This code is part of the https://github.com/aaronbloomfield/pdr repository

#ifndef HEAP_H
#define HEAP_H

#include <vector>
#include "huffmanNode.h"
using namespace std;

class heap {
public:
    heap();
    ~heap();

    void insert(huffmanNode* node);
    huffmanNode* findMin();
    void deleteMin();
    unsigned int getSize(); //of heap

    heap createHuffmanTree(heap h); //constructs the huffman tree
	void setHuffmanCode(huffmanNode* root, string code); //sets the path to each node
	void printHuffmanCode(huffmanNode* root, string code); //only prints the path to each node
    vector<huffmanNode*> getVectorHeap(); //used for getting path in main()


private:
    vector<huffmanNode*> huffmanHeap;
    unsigned int heapSize;

    void percolateUp(int hole);
    void percolateDown(int hole);
};
#endif
