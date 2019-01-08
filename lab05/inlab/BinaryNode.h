//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: BinaryNode.h
//Date:10/14/2018

#ifndef BINARYNODE_H
#define BINARYNODE_H
#include <string>
using namespace std;

class BinaryNode {
  BinaryNode();
  ~BinaryNode();

  string value;
  BinaryNode* left;
  BinaryNode* right;

  friend class BinarySearchTree;
};

#endif