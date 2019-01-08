#Name:Shahroz Imtiaz
#Email ID:si6rf
#File Name: Makefile
#Date:10/14/2018

CXX = clang++

CXXFLAGS = -Wall -O2

OFILES = BinaryNode.o BinarySearchTree.o BSTPathTest.o

.SUFFIXES: .o .cpp

pizza: $(OFILES)
	$(CXX) $(CXXFLAGS) $(OFILES)

clean:
	-rm -f *.o *~ *.out

BSTPathTest.o: BSTPathTest.cpp BinarySearchTree.h BinaryNode.h
BinaryNode.o: BinaryNode.cpp BinaryNode.h
BinarySearchTree.o: BinarySearchTree.cpp BinarySearchTree.h BinaryNode.h
