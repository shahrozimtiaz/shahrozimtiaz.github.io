#!/bin/bash
# Name:Shahroz Imtiaz
# Email ID:si6rf
# File Name: averagetime.sh
# Date:10/31/2018

#prompt user and read in exponent value AND quit if necessary
read -p "Enter the exponent for counter.cpp " exponent
if [ $exponent == "quit" ]; then
	exit 0
fi
TOTAL_RUNNING_TIME=0;
#run program 5 times using exponent given before AND compute total running time of 5 runs
COUNTER=1
while [  $COUNTER -lt 6 ]; do
	RUNNING_TIME=`./a.out $exponent | tail -1`
	echo "Running iteration" $COUNTER"..."
	echo "time taken: " $RUNNING_TIME "ms"
	let COUNTER=COUNTER+1
	let TOTAL_RUNNING_TIME=TOTAL_RUNNING_TIME+RUNNING_TIME
done
#print out total time of 5 runs
echo "5 iterations took" $TOTAL_RUNNING_TIME "ms"
#print out average time of 5 runs
echo "Average time was" $(( TOTAL_RUNNING_TIME / 5 )) "ms"