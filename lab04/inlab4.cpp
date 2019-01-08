//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:inlab4.cpp
//Date:9/25/2018

#include <iostream>
#include <cmath>
#include <climits>
using namespace std;

void sizeOfTest(){
  cout << "Size of int: " << sizeof(int) << endl;
  cout << "Size of unsigned int: " << sizeof(unsigned int) << endl;
  cout << "Size of float: " << sizeof(float) << endl;
  cout << "Size of double: " << sizeof(double) << endl;
  cout << "Size of char: " << sizeof(char) << endl;
  cout << "Size of bool: " << sizeof(bool) << endl;
  cout << "Size of int*: " << sizeof(int*) << endl;
  cout << "Size of char*: " << sizeof(char*) << endl;
  cout << "Size of double*: " << sizeof(double*) << endl;
}
void maxValueTest(){
  int i = INT_MAX;
  unsigned int ui = UINT_MAX;
  char c = CHAR_MAX;
  cout << i << endl << ui << endl << c << endl; 
}
void storedAs(){
  int i = 0;
  unsigned int ui = 0;
  float f = 0;
  double d = 0;
  char c = '0';
  bool b = false;
  int* ip = NULL;
  char* cp = NULL;
  double* dp = NULL;

  i = 1;
  ui = 1;
  f = 1;
  d = 1;
  c = '1';
  b = true;

  cout << i << ui << f << d << c << b << endl;
}
int main(){
  maxValueTest();
  sizeOfTest();
  storedAs();
  
  ///////////////////////Primitive Arrays in C++
  
  int element = 23;
  
  int IntArray[10];
  char CharArray[10];
  int IntArray2D[6][5];
  char CharArray2D[6][5];

  for(int i=0;i<10;i++){
    IntArray[i] = element;
    element++;
  }
  for(int i=0;i<10;i++){
    CharArray[i] = (char)element;
    element++;
  }
  for(int r=0;r<6;r++){
    for(int c=0;c<5;c++){
      CharArray2D[r][c] = (char)element;
      element++;
    }
  }
  for(int r=0;r<6;r++){
    for(int c=0;c<5;c++){
      IntArray2D[r][c] = element;
      element++;
    }
  }
  return 0;
}
