//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: mathfun.cpp
//Date:11/4/2018

#include <iostream>
#include <cstdlib>
using namespace std;

extern "C" int product (int, int);
extern "C" int power (int, int);

int main(){
	int x,y;
	cout<<"Please enter in value for x \n";
	cin>>x;
	cout<<"Please enter in value for y \n";
	cin>>y;

	cout<<product(x,y)<<endl;
	cout<<power(x,y)<<endl;
	return 0;
}