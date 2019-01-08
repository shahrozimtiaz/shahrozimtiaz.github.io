//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:testPostfixCalc.cpp
//Date:9/9/2018

#include "postfixCalculator.h"
#include <iostream>
#include <cstdlib>

using namespace std;

int main(){
  
  PostfixCalculator p;
  p.pushNum (1);
  p.pushNum (2);
  p.pushNum (3);
  p.pushNum (4);
  p.pushNum (5);
  p.add();
  p.add();
  p.add();
  p.add();
  cout << "Result for addition.txt is: " << p.getTopValue() << endl;
  return 0;
  
  /*
    PostfixCalculator p;
    p.pushNum (20);
    p.pushNum (10);
    p.subtract();
    p.pushNum (-3);
    p.pushNum (10);
    p.subtract();
    p.subtract();
    p.pushNum (2);
    p.subtract();
    cout << "Result for subtraction.txt is: " << p.getTopValue() << endl;
    return 0;

    PostfixCalculator p;
    p.pushNum (-1);
    p.pushNum (-2);
    p.pushNum (-5);
    p.pushNum (3);
    p.multiply();
    p.pushNum (2);
    p.pushNum(-2);
    p.multiply();
    p.multiply();
    p.multiply();
    p.multiply();
    cout << "Result for multiplication.txt is: " << p.getTopValue() << endl;
    return 0;
    
    PostfixCalculator p;
    p.pushNum (-1512);
    p.pushNum (-12);
    p.pushNum (-2);
    p.divide();
    p.divide();
    p.pushNum (-2);
    p.divide();
    p.pushNum (3);
    p.divide();
    cout << "Result for division.txt is: " << p.getTopValue() << endl;
    return 0;

    PostfixCalculator p;
    p.pushNum (-1);
    p.negate();
    p.negate();
    p.negate();
    cout << "Result for negation.txt is: " << p.getTopValue() << endl;
    return 0;
  */

	     
}//main
