//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: AVLNode.cpp
//Date:10/18/2018

#include "AVLNode.h"
#include <string>
using namespace std;

AVLNode::AVLNode() {
  value = "?";
  left = NULL;
  right = NULL;
  height = 0;
}
AVLNode::AVLNode(string v, AVLNode* leftN,AVLNode* rightN, int hi) {
  value = v;
  left = leftN;
  right = rightN;
  height = hi;
}

AVLNode::~AVLNode() {
  delete left;
  delete right;
  left = NULL;
  right = NULL;
}