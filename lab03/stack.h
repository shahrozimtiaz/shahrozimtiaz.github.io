//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:stack.h
//Date:9/18/2018

#ifndef STACK_H
#define STACK_H

#include "List.h"
#include "ListNode.h"
#include "ListItr.h"
using namespace std;

class Stack{
public:
  Stack(); //not necessary but I thought I should include it...
  void push(int e);
  void pop();
  int top();
  void empty();
private:
  List myStack;
};//class

#endif
