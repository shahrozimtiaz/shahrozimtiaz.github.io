#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;

class Alexa {
    public:
       void print() {
       cout<<"From class A\n"; 
   }
};

class Bart : public Alexa {
    public:
       void print(){
        cout<<"From class B\n";
    }
};

int main () {
    srand(time(NULL));
    int boolean = rand() % 2;
    Alexa *test;
    if ( boolean)
        test = new Alexa();
    else
        test = new Bart();
    test->print();
    return 0;
}