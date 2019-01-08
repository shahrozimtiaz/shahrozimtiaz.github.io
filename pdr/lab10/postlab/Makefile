#Name:Shahroz Imtiaz
#Email ID:si6rf
#File Name: Makefile
#Date:10/25/2018

CXX = clang++
C = clang

CXXFLAGS = -Wall

OPREFILES = huffmanenc.o heap.o huffmanNode.o 
OINFILES = huffmandec.o huffmanNode.o 
OLINKFILES = linkedlist.o

.SUFFIXES: .o .cpp

main: $(OPREFILES) $(OINFILES) $(OLINKFILES)
	$(CXX) $(CXXFLAGS) $(OPREFILES) -o encoder
	$(CXX) $(CXXFLAGS) $(OINFILES) -o decoder
	$(C) $(OLINKFILES) -o linkedlist

clean:
	-rm -f *.o *~ *.out

heap.o: heap.cpp heap.h huffmanNode.h
huffmanNode.o: huffmanNode.cpp huffmanNode.h
huffmanenc.o: huffmanenc.cpp heap.h huffmanNode.h
huffmandec.o: huffmandec.cpp huffmanNode.h
linkedlist.o: linkedlist.c
