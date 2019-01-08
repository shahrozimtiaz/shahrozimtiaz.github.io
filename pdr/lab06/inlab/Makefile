#Name:Shahroz Imtiaz
#Email ID:si6rf
#File Name: Makefile
#Date:10/21/2018

CXX = clang++

CXXFLAGS = -Wall

OFILES = wordPuzzle.o timer.o hashTable.o

.SUFFIXES: .o .cpp

pizza: $(OFILES)
	$(CXX) $(CXXFLAGS) $(OFILES)

clean:
	-rm -f *.o *~ *.out

hashTable.o: hashTable.cpp hashTable.h
timer.o: timer.cpp timer.h
wordPuzzle.o: wordPuzzle.cpp hashTable.h timer.h
