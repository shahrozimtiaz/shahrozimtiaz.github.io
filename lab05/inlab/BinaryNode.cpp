//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: BinaryNode.cpp
//Date:10/14/2018

#include "BinaryNode.h"
#include <string>
using namespace std;

BinaryNode::BinaryNode() {
  value = "?";
  left = NULL;
  right = NULL;
}

BinaryNode::~BinaryNode() {
  delete left;
  delete right;
  left = NULL;
  right = NULL;
}