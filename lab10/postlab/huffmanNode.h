//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: huffmanNode.h
//Date:11/25/2018

#ifndef HUFFMAN_NODE_H
#define HUFFMAN_NODE_H

#include <string>
using namespace std;

class huffmanNode{
public:
	huffmanNode(int freq1, char ch1);
	~huffmanNode();

	int getFreq() const;
	char getch();
	string gethuffmanCode();
	//bool operator<(const huffmanNode& n) const;

	huffmanNode *left,*right;
	int freq;
	char ch;
	string huffmanCode;
};
#endif