#Name:Shahroz Imtiaz
#Email ID:si6rf
#File Name: Makefile
#Date:12/2/2018

CXX = clang++

CXXFLAGS = -Wall

OFILES = middleearth.o topological.o

.SUFFIXES: .o .cpp

main: $(OFILES)
	$(CXX) $(CXXFLAGS) $(OFILES)
	doxygen

clean:
	-rm -f *.o *~ *.out

middleearth.o: middleearth.cpp middleearth.h
topological.o: topological.cpp