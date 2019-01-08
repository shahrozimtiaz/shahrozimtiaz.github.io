//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: hashTable.cpp
//Date:10/22/2018

#include "hashTable.h"

hashTable::hashTable(){
	buckets = new vector< list<string> >;
	tableSize = buckets->size();
}
hashTable::hashTable(int size){
	buckets = new vector< list<string> >;
	if(checkprime(2*size)){
		tableSize = 2*size;//optimized
		buckets->resize(tableSize);
	}
	else{
		tableSize = getNextPrime(2*size);//optimized
		buckets->resize(tableSize);
	}
}
hashTable::~hashTable(){
	delete buckets;
}
void hashTable::put(string str){
	unsigned int hashValue = hash(str);
	buckets->at(hashValue).push_back(str);
}
bool hashTable::contains(string str){
	list<string> &chain = buckets->at(getHashValue(str));
	for(list<string>::iterator it=chain.begin();it!=chain.end();++it){
		if(*it == str)
			return true;
	}
	return false;
}
unsigned int hashTable::hash(string str){
	unsigned int hashValue = 7;
	for(int i=0;i<str.length();i+=2){//optimized
		hashValue=hashValue*23+str[i];//optimized
	}
	return hashValue%tableSize;
}
unsigned int hashTable::getHashValue(string str){
	return hash(str);
}
bool hashTable::checkprime(unsigned int p) {
    if ( p <= 1 ) // 0 and 1 are not primes; the are both special cases
        return false;
    if ( p == 2 ) // 2 is prime
        return true;
    if ( p % 2 == 0 ) // even numbers other than 2 are not prime
        return false;
    for ( int i = 3; i*i <= p; i += 2 ) // only go up to the sqrt of p
        if ( p % i == 0 )
            return false;
    return true;
}

int hashTable::getNextPrime (unsigned int n) {
    while ( !checkprime(++n) );
    return n; // all your primes are belong to us
}