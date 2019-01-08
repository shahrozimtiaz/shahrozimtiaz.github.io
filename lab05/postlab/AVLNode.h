//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: AVLNode.h
//Date:10/18/2018

#ifndef AVLNODE_H
#define AVLNODE_H
#include <string>
using namespace std;

class AVLNode {
  AVLNode();
  AVLNode(string v, AVLNode* leftN,AVLNode* rightN, int hi);
  ~AVLNode();

  string value;
  AVLNode* left;
  AVLNode* right;
  int height;

  friend class AVLTree;
};

#endif