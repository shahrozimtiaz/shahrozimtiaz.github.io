//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: AVLTree.cpp
//Date:10/18/2018

#include "AVLTree.h"
#include <string>
#include "AVLNode.h"
using namespace std;

AVLTree::AVLTree() { 
  root = NULL; 
  nodeCount=0;
}

AVLTree::~AVLTree() {
  delete root;
  root = NULL;
}

// insert finds a position for x in the tree and places it there, rebalancing
// as necessary.
void AVLTree::insert(const string& x) {
  // YOUR IMPLEMENTATION GOES HERE
	insert(root,x);
}

// remove finds x's position in the tree and removes it, rebalancing as
// necessary.
void AVLTree::remove(const string& x) { 
  if(find (x)){
   root = remove(root, x);
   nodeCount--;
  }
}

// pathTo finds x in the tree and returns a string representing the path it
// took to get there.
string AVLTree::pathTo(const string& x){
  // YOUR IMPLEMENTATION GOES HERE
	if(!find(x))
		return "";
	else
		return pathTo(root,x);
}

// find determines whether or not x exists in the tree.
bool AVLTree::find(const string& x)  {
  // YOUR IMPLEMENTATION GOES HERE
	return find(root,x);
}

// numNodes returns the total number of nodes in the tree.
int AVLTree::numNodes() const {
  // YOUR IMPLEMENTATION GOES HERE
    return nodeCount;
}

// balance makes sure that the subtree with root n maintains the AVL tree
// property, namely that the balance factor of n is either -1, 0, or 1.
void AVLTree::balance(AVLNode*& n) {
  // YOUR IMPLEMENTATION GOES HERE
	if(height(n->right) - height(n->left) == 2){
		 if (height(n->right->right) >= height(n->right->left)) {
		 	rotateLeft(n);
		 }
		 else{
		 	rotateRight(n->right);
		 	rotateLeft(n);
		 }
	}
	else if(height(n->right) - height(n->left) == -2){
		if (height(n->left->left) >= height(n->left->right)) {
		 	rotateRight(n);
		 }
		 else{
		 	rotateLeft(n->left);
		 	rotateRight(n);
		 }
	}
}

// rotateLeft performs a single rotation on node n with its right child.
AVLNode* AVLTree::rotateLeft(AVLNode*& n) {
  // YOUR IMPLEMENTATION GOES HERE
  AVLNode* c = n->right;
  n->right = c->left;
  c->left = n;
  n->height = 1 + max(height(n->left), height(n->right));
  c->height = 1 + max(height(c->left), height(c->right));
  n = c;
  return n;
}

// rotateRight performs a single rotation on node n with its left child.
AVLNode* AVLTree::rotateRight(AVLNode*& n) {
  // YOUR IMPLEMENTATION GOES HERE
  AVLNode* c = n->left;
  n->left = c->right;
  c->right = n;
  n->height = 1 + max(height(n->left), height(n->right));
  c->height = 1 + max(height(c->left), height(c->right));
  n = c;
  return n;
}

// private helper for remove to allow recursion over different nodes. returns
// an AVLNode* that is assigned to the original node.
AVLNode* AVLTree::remove(AVLNode*& n, const string& x) {
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
      AVLNode* temp = n->right;
      n->right = NULL;
      delete n;
      n = NULL;
      return temp;
    }
    if (n->right == NULL) {
      AVLNode* temp = n->left;
      n->left = NULL;
      delete n;
      n = NULL;
      return temp;
    }
    // two children -- tree may become unbalanced after deleting n
    string sr = min(n->right);
    n->value = sr;
    n->right = remove(n->right, sr);
  } else if (x < n->value) {
    n->left = remove(n->left, x);
  } else {
    n->right = remove(n->right, x);
  }
  n->height = 1 + max(height(n->left), height(n->right));
  balance(n);
  return n;
}
string AVLTree::pathTo(AVLNode*& n, const string& x){//private
	if(x==n->value)
		return n->value;
	else if(x<n->value)
		return n->value + " " + pathTo(n->left,x);
	else
		return n->value + " " + pathTo(n->right,x);
}
bool AVLTree::find(AVLNode*& n, const string& x)  {//private
  // YOUR IMPLEMENTATION GOES HERE
	if(n==NULL)
		return false;
	else if(x==n->value)
		return true;
	else if(x<n->value)
		return find(n->left,x);
	else
		return find(n->right,x);
}
void AVLTree::insert(AVLNode*& n, const string& x) {//private
  // YOUR IMPLEMENTATION GOES HERE
	if(root==NULL){
		n = new AVLNode(x,NULL,NULL,0);
		root = n;
	    nodeCount++;
	}
	else{
		if(n==NULL){
			n = new AVLNode(x,NULL,NULL,0);
		    nodeCount++;
		}
		else if(x<n->value)
			insert(n->left,x);
		else if(x>n->value)
			insert(n->right,x);
	}
	n->height = 1 + max(height(n->left),height(n->right));
	balance(n);
}

// min finds the string with the smallest value in a subtree.
string AVLTree::min(AVLNode* node) const {
  // go to bottom-left node
  if (node->left == NULL) {
    return node->value;
  }
  return min(node->left);
}

// height returns the value of the height field in a node. If the node is
// null, it returns -1.
int AVLTree::height(AVLNode* node) const {
  if (node == NULL) {
    return -1;
  }
  return node->height;
}

// max returns the greater of two integers.
int max(int a, int b) {
  if (a > b) {
    return a;
  }
  return b;
}

// Helper function to print branches of the binary tree
void showTrunks(Trunk* p) {
  if (p == nullptr) return;
  showTrunks(p->prev);
  cout << p->str;
}

// Recursive function to print binary tree
// It uses inorder traversal
void AVLTree::printTree(AVLNode* root, Trunk* prev, bool isLeft) {
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
  cout << root->value<<endl;

  if (prev) prev->str = prev_str;
  trunk->str = "   |";

  printTree(root->right, trunk, false);
}

void AVLTree::printTree() { printTree(root, NULL, false); }