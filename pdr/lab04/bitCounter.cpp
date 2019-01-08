//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:bitCounter.cpp
//Date:9/27/2018

#include <iostream>
#include <cstdlib>
using namespace std;

int binaryBitcounter(int x){
  if(x==1) return 1;
  return binaryBitcounter(x/2) + (x%2);
}//function

int main(int argc, char* argv[]){
  if(argc == 1){
    cout<<"No input was detected... Now gracefully exiting."<<endl;
    exit(1);
  }
  cout<<"Number of 1's in binary representation of "<<
    argv[1]<<": "<<binaryBitcounter(atoi(argv[1]))<<endl;
}//main
