#!/bin/bash
# Name:Shahroz Imtiaz
# Email ID:si6rf
# File Name: averagetime.sh
# Date:10/23/2018

#prompt user and read in file names
read -p "Enter dictionary: " str1
read -p "Enter grid name: " str2
#run program 5 times using file names given before
RUNNING_TIME1=`./a.out $str1 $str2 | tail -1`
RUNNING_TIME2=`./a.out $str1 $str2 | tail -1`
RUNNING_TIME3=`./a.out $str1 $str2 | tail -1`
RUNNING_TIME4=`./a.out $str1 $str2 | tail -1`
RUNNING_TIME5=`./a.out $str1 $str2 | tail -1`
#compute total running time of 5 runs
let 'TOTAL_RUNNING_TIME = RUNNING_TIME1 + RUNNING_TIME2+RUNNING_TIME3 + RUNNING_TIME4 + RUNNING_TIME5'
#print out average time of 5 runs
echo "Average runtime : " $(( TOTAL_RUNNING_TIME / 5 )) " ms"