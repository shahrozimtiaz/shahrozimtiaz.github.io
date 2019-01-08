//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:postfixCalculator.cpp
//Date:9/9/2018

//#include "stack.h"
#include "postfixCalculator.h"
#include <cstdlib>
#include <iostream>

using namespace std;

void PostfixCalculator::pushNum(int e){
  intStack.push(e);
}
void PostfixCalculator::add(){
  int x1 = intStack.top();
  intStack.pop();
  int x2 = intStack.top();
  intStack.pop();

  int x3 = x2 + x1;
  intStack.push(x3);
}
void PostfixCalculator::subtract(){
  int x1 = intStack.top();
  intStack.pop();
  int x2 = intStack.top();
  intStack.pop();

  int x3 = x2 - x1;
  intStack.push(x3);
}
void PostfixCalculator::multiply(){
  int x1 = intStack.top();
  intStack.pop();
  int x2 = intStack.top();
  intStack.pop();

  int x3 = x2 * x1;
  intStack.push(x3);
}
void PostfixCalculator::divide(){
  int x1 = intStack.top();
  intStack.pop();
  int x2 = intStack.top();
  intStack.pop();

  int x3 = x2 / x1;
  intStack.push(x3);
}
void PostfixCalculator::negate(){
  int x1 = intStack.top();
  intStack.pop();

  int x2 = x1 * -1;
  intStack.push(x2);
}
int PostfixCalculator::getTopValue(){
    int x1 = intStack.top();
    return x1;
}


