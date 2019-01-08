//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: hashTable.h
//Date:10/22/2018

#ifndef HASHTABLE_H
#define HASHTABLE_H

#include <vector>
#include <list>
#include <string>
#include <iostream>

using namespace std;

class hashTable{
public:
	hashTable();
	hashTable(int size);
	~hashTable();
//hash table operations
	void put(string str);
	bool contains(string str);
	unsigned int hash(string str);
//prime stuff
	bool checkprime(unsigned int p);
	int getNextPrime (unsigned int n);

private:
	vector< list<string> > *buckets;
	int tableSize;
	unsigned int getHashValue(string str);
};
#endif