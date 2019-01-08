//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:postfixCalculator.h
//Date:9/9/2018

#ifndef POSTFIXCALCULATOR_H
#define POSTFIXCALCULATOR_H

#include <stack>

using namespace std;

class PostfixCalculator{
 public:
  
  PostfixCalculator();
  void pushNum(int e);
  void add();
  void subtract();
  void multiply();
  void divide();
  void negate();
  int getTopValue();

private:
  stack<int>* intStack;
};//class

#endif