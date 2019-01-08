//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:TreeCalc.cpp
//Date:10/13/2018
// TreeCalc.cpp:  CS 2150 Tree Calculator method implementations

#include "TreeCalc.h"
#include <iostream>

using namespace std;

//Constructor
TreeCalc::TreeCalc() {//Not necessary...
}

//Destructor- frees memory
TreeCalc::~TreeCalc() {
    while(!mystack.empty()){
        cleanTree(mystack.top());
        mystack.pop();
    }
}

//Deletes tree/frees memory
void TreeCalc::cleanTree(TreeNode* ptr) {
    if(ptr==NULL) return;
    cleanTree(ptr->left);
    cleanTree(ptr->right);
    delete ptr;
}

//Gets data from user
void TreeCalc::readInput() {
    string response;
    cout << "Enter elements one by one in postfix notation" << endl
    << "Any non-numeric or non-operator character,"
    << " e.g. #, will terminate input" << endl;
    cout << "Enter first element: ";
    cin >> response;
    //while input is legal
    while (isdigit(response[0]) || response[0]=='/' || response[0]=='*'
        || response[0]=='-' || response[0]=='+' ) {
        insert(response);
    cout << "Enter next element: ";
    cin >> response;
    }
}

//Puts value in tree stack
void TreeCalc::insert(const string& val) {
    if(val.length()>1 or isdigit(val[0])){
        TreeNode* operand1 = new TreeNode(val);
        mystack.push(operand1);
    }
    else{
        TreeNode* operator1 = new TreeNode(val);
        operator1->right = mystack.top();
        mystack.pop();
        operator1->left = mystack.top();
        mystack.pop();
        mystack.push(operator1);
    }
}

//Prints data in prefix form
void TreeCalc::printPrefix(TreeNode* ptr) const {
    // print the tree in prefix format
    if(ptr==NULL) return;
    cout<<ptr->value<<" ";
    printPrefix(ptr->left);
    printPrefix(ptr->right);
}

//Prints data in infix form
void TreeCalc::printInfix(TreeNode* ptr) const {
    // print tree in infix format with appropriate parentheses
    if(ptr==NULL) return;
    if(!isdigit(ptr->value[0]) && ptr->value.length()<2)
        cout<<"(";
    printInfix(ptr->left);
    if(!isdigit(ptr->value[0]) && ptr->value.length()<2)
        cout<<" "<<ptr->value<<" ";
    else
        cout<<ptr->value;
    printInfix(ptr->right);
    if(!isdigit(ptr->value[0]) && ptr->value.length()<2)
        cout<<")";
}

//Prints data in postfix form
void TreeCalc::printPostfix(TreeNode* ptr) const {
    // print the tree in postfix form
    if(ptr==NULL)return;
    printPostfix(ptr->left);
    printPostfix(ptr->right);
    cout<<ptr->value<<" ";
}

// Prints tree in all 3 (pre,in,post) forms

void TreeCalc::printOutput() const {
    if (mystack.size()!=0 && mystack.top()!=NULL) {
        cout << "Expression tree in postfix expression: ";
        printPostfix(mystack.top());// call your implementation of printPostfix()
        cout << endl;
        cout << "Expression tree in infix expression: ";
        printInfix(mystack.top());// call your implementation of printInfix()
        cout << endl;
        cout << "Expression tree in prefix expression: ";
        printPrefix(mystack.top());// call your implementation of printPrefix()
        cout << endl;
    } else
    cout<< "Size is 0." << endl;
}

//Evaluates tree, returns value
// private calculate() method
int TreeCalc::calculate(TreeNode* ptr) const {
    // Traverse the tree and calculates the result
    if(ptr==NULL) return 0;
    string stored = ptr->value;
    if(stored == "+")
        return calculate(ptr->left) + calculate(ptr->right);
    else if(stored == "-")
        return calculate(ptr->left) - calculate(ptr->right);
    else if(stored == "/")
        return calculate(ptr->left) / calculate(ptr->right);
    else if(stored == "*")
        return calculate(ptr->left) * calculate(ptr->right);
    return atoi(stored.c_str());
}

//Calls calculate, sets the stack back to a blank stack
// public calculate() method. Hides private data from user
int TreeCalc::calculate() {
    int i = 0;
    i = calculate(mystack.top());// call private calculate method here
     while (!mystack.empty()){
        cleanTree(mystack.top());
        mystack.pop();
    }
    return i;
}
