//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: huffmanNode.cpp
//Date:11/25/2018

#include "huffmanNode.h"
#include <iostream>
using namespace std;

huffmanNode::huffmanNode(int freq1, char ch1){
	freq=freq1;
	ch=ch1;
	huffmanCode="";
	left=NULL;
	right=NULL;
}
huffmanNode::~huffmanNode(){
	delete left;
	delete right;
}
int huffmanNode::getFreq() const{
	return freq;
}
char huffmanNode::getch(){
	return ch;
}
string huffmanNode::gethuffmanCode(){
	return huffmanCode;
}
// bool huffmanNode::operator<(const huffmanNode& other) const{
// 	if(this->getFreq()<other.getFreq())
// 		return true;
// 	else
// 		return false;
// }