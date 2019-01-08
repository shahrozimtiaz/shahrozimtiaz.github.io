#Name:Shahroz Imtiaz
#Email ID:si6rf
#File Name: Makefile
#Date:10/18/2018

CXX = clang++

CXXFLAGS = -Wall -O2

OFILES = AVLNode.o AVLTree.o AVLPathTest.o

.SUFFIXES: .o .cpp

pizza: $(OFILES)
	$(CXX) $(CXXFLAGS) $(OFILES)

clean:
	-rm -f *.o *~ *.out

AVLNode.o: AVLNode.cpp AVLNode.h
AVLPathTest.o: AVLPathTest.cpp AVLTree.h AVLNode.h
AVLTree.o: AVLTree.cpp AVLTree.h AVLNode.h
