#Name:Shahroz Imtiaz
#Email ID:si6rf
#File Name: Makefile
#Date:12/4/2018

CXX = clang++

CXXFLAGS = -O2

OFILES = middleearth.o traveling.o

.SUFFIXES: .o .cpp

main: $(OFILES)
	$(CXX) $(CXXFLAGS) $(OFILES)
	doxygen

middleearth.o: middleearth.cpp middleearth.h
traveling.o: traveling.cpp middleearth.h
