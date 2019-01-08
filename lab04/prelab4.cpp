//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:prelab4.cpp
//Date:9/23/2018

#include <iostream>
#include <cmath>
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
void outputBinary(unsigned int x){
  cout << "Binary representation of " << x << " //=> ";
  string s = "";
  int count = 0;
  for(int i=31;i>=0;i--){
    if(count == 4){
      s += " ";
      count = 0;
    }
    if(x/(pow(2,i)) >= 1){
      s += "1";
      x -= pow(2,i);
    }
    else s += "0";
    count++;
  }
  cout << s << endl;
}
void overflow(){
  unsigned int max = pow(2,(sizeof(unsigned int)*8))-1;
  cout << "Max value of unsigned int: " << max << endl;
  max += 1;
  cout << "Value of unsigned int after adding 1 to max value: " <<  max << endl;
  cout << "Explaination: The binary representation of the max value of an unsigned int is all 1's. If you add a 1 to that binary, all of the ones switch to 0's and thus the output is the number zero" << endl;
}
int main(){
  unsigned int x;
  cout << "Enter input..." << endl;
  cin >> x;
  sizeOfTest();
  outputBinary(x);
  overflow();
  return 0;
}
