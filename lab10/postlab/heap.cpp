//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: heap.cpp
//Date:11/25/2018

//*NOTE: Some heap code was taken from the lecture slides and modified*

//ORIGINAL CODE:
// written by Aaron Bloomfield, 2014
// Released under a CC BY-SA license
// This code is part of the https://github.com/aaronbloomfield/pdr repository

#include <iostream>
#include "heap.h"
using namespace std;

// default constructor
heap::heap() : heapSize(0) {
    huffmanHeap.push_back(0);
}

// the destructor doesn't need to do much
heap::~heap() {
	huffmanHeap.clear();
	heapSize=0;
}

void heap::insert(huffmanNode* node) {
    // a vector push_back will resize as necessary
    huffmanHeap.push_back(node);
    percolateUp(++heapSize);
}

void heap::percolateUp(int hole) {
    // get the value just inserted
    huffmanNode* n = huffmanHeap[hole];
    // while we haven't run off the top and while the
    // value is less than the parent...
    for ( ; (hole > 1) && (n->getFreq() <= huffmanHeap[hole/2]->getFreq()); hole /= 2 ){
          huffmanHeap[hole] = huffmanHeap[hole/2]; // move the parent down
    }
    // correct position found!  insert at that spot
    huffmanHeap[hole] = n;
    //cout<<"min: "<<findMin()->getch()<<" "<<findMin()->getFreq()<<endl;
}

void heap::deleteMin() {
    // make sure the heap is not empty
    if ( heapSize == 0 )
        throw "deleteMin() called on empty heap";
    // move the last inserted position into the root
    huffmanHeap[1] = huffmanHeap[heapSize--];
    // make sure the vector knows that there is one less element
    huffmanHeap.pop_back();
    // percolate the root down to the proper position
     percolateDown(1);
}
void heap::percolateDown(int hole) {
    // get the value to percolate down
    huffmanNode* n = huffmanHeap[hole];
    // while there is a left child...
    while ( hole*2 <= heapSize ) {
        int child = hole*2; // the left child
        // is there a right child?  if so, is it lesser?
        if ( (child+1 <= heapSize) && (huffmanHeap[child+1]->getFreq() <= huffmanHeap[child]->getFreq()) )
            child++;
        // if the child is greater than the node...
        if ( huffmanHeap[child]->getFreq() <= n->getFreq() ) {
            huffmanHeap[hole] = huffmanHeap[child]; // move child up
            hole = child;             // move hole down
        } else
            break;
    }
    // correct position found!  insert at that spot
    huffmanHeap[hole] = n;
}

huffmanNode* heap::findMin() {
    if ( heapSize == 0 )
        throw "findMin() called on empty heap";
    return huffmanHeap[1];
}

unsigned int heap::getSize() {
    return heapSize;
}
heap heap::createHuffmanTree(heap h){
	while(h.getSize()>1){
		huffmanNode* l = h.findMin();
		h.deleteMin();
		huffmanNode* r = h.findMin();
		h.deleteMin();
		huffmanNode* lr = new huffmanNode(l->getFreq() + r->getFreq(), '-');
		lr->left=l;
		lr->right=r;
		h.insert(lr);
	}
	return h;
}
void heap::setHuffmanCode(huffmanNode* root, string code){
	if(root->left==NULL && root->right==NULL)
		root->huffmanCode=code;
	if(root->left != NULL)
		setHuffmanCode(root->left, code+"0");
	if(root->right != NULL)
		setHuffmanCode(root->right, code+"1");
}
void heap::printHuffmanCode(huffmanNode* root, string code){
	if(root->left==NULL && root->right==NULL){
        if(root->ch==' '){
            cout<<"space"<<" "<<code<<endl;
        }else 
        cout<<root->ch<<" "<<code<<endl;
    }
	if(root->left != NULL)
		printHuffmanCode(root->left, code+"0");
	if(root->right != NULL)
		printHuffmanCode(root->right, code+"1");
}
vector<huffmanNode*> heap::getVectorHeap(){
    return huffmanHeap;
}
