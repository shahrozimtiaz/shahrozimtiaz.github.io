//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: shoes.cpp
//Date:11/6/2018
#include <iostream>
using namespace std;

class shoes{

public:
	int quantity;
	double size;
	char color;

shoes(int quantity, double size, char color, long price, string brand){
	this->quantity=quantity;
	this->size=size;
	this->color=color;
	this->price=price;
	this->brand=brand;
}
int getPrice(){
	return this->price;
}
int isBetter(shoes &other){
	if(this->getPrice()>other.getPrice())
		return 0;
	else return 1;
}
void para1 (int* p,int& r){
	cout<<p<<endl;
    cout<<r<<endl; 
}
private:
	long price;
	string brand;


};
int main(){
	shoes runners = shoes(2,9.5,'B',8,"Nike");
	shoes runners2 = shoes(1,8.5,'W',6,"Adidas");

	cout<<runners.isBetter(runners2)<<endl;
}