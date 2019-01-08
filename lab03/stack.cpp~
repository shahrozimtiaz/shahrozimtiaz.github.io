//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:stack.cpp
//Date:9/18/2018

#include "stack.h"
#include <iostream>
#include <cstdlib>

Stack::Stack(){  //not necessary but I thought I should include it...
}
void Stack::push(int e){
  myStack.insertAtFront(e);
}
void Stack::pop(){
  if(myStack.isEmpty()){
    cout << "Stack is empty..." << endl;
    exit(1);
  }
  myStack.removeFromFront();
}
int Stack::top(){
  if(myStack.isEmpty()){
    cout << "Stack is empty..." << endl;
    exit(1);
  }
  return myStack.first().retrieve();
}
void Stack::empty(){
  myStack.makeEmpty();
}
