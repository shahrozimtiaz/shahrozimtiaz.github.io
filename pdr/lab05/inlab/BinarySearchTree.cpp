//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: BinarySearchTree.cpp
//Date:10/14/2018

#include "BinarySearchTree.h"
#include <string>
#include "BinaryNode.h"
#include <iostream>
using namespace std;

BinarySearchTree::BinarySearchTree() { 
  root = NULL; 
  nodeCount=0;
}

BinarySearchTree::~BinarySearchTree() {
	delete root;
	root = NULL;
}

// insert finds a position for x in the tree and places it there.
void BinarySearchTree::insert(const string& x) {
  // YOUR IMPLEMENTATION GOES HERE
  BinaryNode* temp = new BinaryNode();
  temp->value = x;
  BinaryNode* n;
  if(root==NULL){
    temp->value = x;
    root = temp;
    nodeCount=1;
  }
  else{ 
    n = root;
    while(n!=NULL){
      if(x==n->value)
        break;
      else if(x<n->value){
        if(n->left == NULL){
          n->left = temp;
          nodeCount++;
          break;
        }
        else
          n=n->left;
      }
      else if(x>n->value){
       if(n->right == NULL){
        n->right = temp;
        nodeCount++;
        break;
      }
      else
        n=n->right;
    }
  }
  }
}
// remove finds x's position in the tree and removes it.
void BinarySearchTree::remove(const string& x) { 
  root = remove(root, x);
  nodeCount--;
 }

// pathTo finds x in the tree and returns a string representing the path it
// took to get there.
 string BinarySearchTree::pathTo(const string& x) const {
  // YOUR IMPLEMENTATION GOES HERE
  if(!find(x)){
    return "";
  }
  else{
    string answer = "";
    BinaryNode* n;
    if(root==NULL)
      return "";
    else{ 
      n = root;
      while(n!=NULL){
        if(x==n->value){
         answer += n->value + " ";
         break;
       }
       else if(x<n->value){
        answer += n->value + " ";
        n = n->left;
      }
      else if(x>n->value){
        answer += n->value + " ";
        n = n->right;
      }
    }
  }
  return answer;
  }
}
// find determines whether or not x exists in the tree.
bool BinarySearchTree::find(const string& x) const {
  bool answer = false;
  BinaryNode* n;
  if(root==NULL){
    return false;
  }
  else{ 
    n = root;
    while(n!=NULL){
      if(x==n->value){
       answer = true;
       break;
     }
     else if(x<n->value){
      n = n->left;
    }
    else if(x>n->value){
      n = n->right;
    }
  }
  }
  return answer;
}

// numNodes returns the total number of nodes in the tree.
int BinarySearchTree::numNodes() const {
    return nodeCount;
}

// private helper for remove to allow recursion over different nodes. returns
// a BinaryNode* that is assigned to the original node.
BinaryNode* BinarySearchTree::remove(BinaryNode*& n, const string& x) {
  if (n == NULL) {
    return NULL;
  }
  // first look for x
  if (x == n->value) {
    // found
    // no children
    if (n->left == NULL && n->right == NULL) {
      delete n;
      n = NULL;
      return NULL;
    }
    // single child
    if (n->left == NULL) {
      BinaryNode* temp = n->right;
      n->right = NULL;
      delete n;
      n = NULL;
      return temp;
    }
    if (n->right == NULL) {
      BinaryNode* temp = n->left;
      n->left = NULL;
      delete n;
      n = NULL;
      return temp;
    }
    // two children
    string sr = min(n->right);
    n->value = sr;
    n->right = remove(n->right, sr);
  } else if (x < n->value) {
    n->left = remove(n->left, x);
  } else {
    n->right = remove(n->right, x);
  }
  return n;
}

// min finds the string with the smallest value in a subtree.
string BinarySearchTree::min(BinaryNode* node) const {
  // go to bottom-left node
  if (node->left == NULL) {
    return node->value;
  }
  return min(node->left);
}

// Helper function to print branches of the binary tree
void showTrunks(Trunk* p) {
  if (p == NULL) return;
  showTrunks(p->prev);
  cout << p->str;
}

// Recursive function to print binary tree
// It uses inorder traversal
void BinarySearchTree::printTree(BinaryNode* root, Trunk* prev, bool isLeft) {
  if (root == NULL) return;

  string prev_str = "    ";
  Trunk* trunk = new Trunk(prev, prev_str);

  printTree(root->left, trunk, true);

  if (!prev)
    trunk->str = "---";
  else if (isLeft) {
    trunk->str = ".---";
    prev_str = "   |";
  } else {
    trunk->str = "`---";
    prev->str = prev_str;
  }

  showTrunks(trunk);
  cout << root->value << endl;

  if (prev) prev->str = prev_str;
  trunk->str = "   |";

  printTree(root->right, trunk, false);
}

void BinarySearchTree::printTree() { printTree(root, NULL, false); }