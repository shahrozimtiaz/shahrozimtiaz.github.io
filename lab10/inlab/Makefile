#Name:Shahroz Imtiaz
#Email ID:si6rf
#File Name: Makefile
#Date:10/25/2018

CXX = clang++

CXXFLAGS = -Wall

OFILES = huffmandec.o huffmanNode.o 

.SUFFIXES: .o .cpp

pizza: $(OFILES)
	$(CXX) $(CXXFLAGS) $(OFILES)

clean:
	-rm -f *.o *~ *.out

huffmanNode.o: huffmanNode.cpp huffmanNode.h
huffmandec.o: huffmandec.cpp huffmanNode.h