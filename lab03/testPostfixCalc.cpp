// Name:Shahroz Imtiaz
// Email ID:si6rf
// File Name:testPostfixCalc.cpp
// Date:9/9/2018

#include "postfixCalculator.h"
#include <iostream>
#include <cstdlib>

using namespace std;

int main(){
  PostfixCalculator p;
  string s;
  
  while (cin >> s) {
    if(s.length()==1){
      if(isdigit(s[0])){
  	p.pushNum(stoi(s));
      }
      else{
  	switch (s[0]) {
  	case '+':p.add();
  	  break;
  	case '-':p.subtract();
  	  break;
  	case '*':p.multiply();
  	  break;
  	case '/':p.divide();
  	  break;
  	case '~':p.negate();
  	  break;
  	default: cout << "invalid input.." << endl;
	  exit(1);
  	}//switch
      }//inner if
    }//if
    else{
      int x = stoi(s);
      p.pushNum(x);
    }//else
  }//while
  cout << "Answer is: " << p.getTopValue() << endl;
  return 0;
}//main
