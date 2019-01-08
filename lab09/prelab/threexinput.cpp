//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: threexinput.cpp
//Date:11/4/2018

#include <iostream>
#include "timer.h"
#include <cstdlib>
using namespace std;

extern "C" int threexplusone (int);

int main(){
	int x,n;
	cout<<"Please enter in value for x \n";
	cin>>x;
	cout<<"Please enter in value for n \n";
	cin>>n;

	int steps;
	double runtime;
	timer t;

	t.start();
	for(int i=1;i<=n;i++){
		steps = threexplusone(x);
	}
	t.stop();
	runtime=t.getTime();

	cout<<"# of steps: "<<steps<<endl;
	cout<<fixed<<"Average runtime: "<<((runtime*1000)/n)<<" milliseconds"<<endl;
	return 0;
}