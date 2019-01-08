#Name:Shahroz Imtiaz
#Email ID:si6rf
#File Name: Makefile
#Date:10/25/2018

CXX = clang++

CXXFLAGS = -Wall

OFILES = huffmanenc.o heap.o huffmanNode.o 

.SUFFIXES: .o .cpp

pizza: $(OFILES)
	$(CXX) $(CXXFLAGS) $(OFILES)

clean:
	-rm -f *.o *~ *.out

heap.o: heap.cpp heap.h huffmanNode.h
huffmanNode.o: huffmanNode.cpp huffmanNode.h
huffmanenc.o: huffmanenc.cpp heap.h huffmanNode.h