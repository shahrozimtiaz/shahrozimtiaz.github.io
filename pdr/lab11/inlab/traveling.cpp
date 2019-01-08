//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: traveling.cpp
//Date:12/4/2018
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <algorithm>

using namespace std;

#include "middleearth.h"

float computeDistance (MiddleEarth &me, string start, vector<string> dests);
void printRoute (string start, vector<string> dests);
/** @brief This method returns the shortest path for a traveling salesman
 *
 * Take advantage of the next_permuation function to determine shortest path from start to start while traveling to certain cities
 * @param argc # of arguments
 * @param argv # array of arguements
 * @return returns 0 upon completion
 */
int main (int argc, char **argv) {
    // check the number of parameters
    if ( argc != 6 ) {
        cout << "Usage: " << argv[0] << " <world_height> <world_width> "
             << "<num_cities> <random_seed> <cities_to_visit>" << endl;
        exit(0);
    }
    // we'll assume the parameters are all well-formed
    int width, height, num_cities, rand_seed, cities_to_visit;
    sscanf (argv[1], "%d", &width);
    sscanf (argv[2], "%d", &height);
    sscanf (argv[3], "%d", &num_cities);
    sscanf (argv[4], "%d", &rand_seed);
    sscanf (argv[5], "%d", &cities_to_visit);
    // Create the world, and select your itinerary
    MiddleEarth me(width, height, num_cities, rand_seed);
    vector<string> dests = me.getItinerary(cities_to_visit);
    // YOUR CODE HERE
    vector<string> destsCopy = dests; //starting route
    float minPath = computeDistance(me, dests[0], dests);
    sort (dests.begin()+1, dests.end());
    while(next_permutation(dests.begin()+1, dests.end())){
        if(computeDistance(me,dests[0],dests)<minPath){
            minPath=computeDistance(me,dests[0],dests); //update to shorter path
            destsCopy=dests; //update to shorter route
        }
    }
    cout<<"Your journey will take you along the path ";
    printRoute(destsCopy[0],destsCopy);
    cout<<" and will have the length "<<minPath<<endl;
    return 0;
}


/** @brief This method returns the total distance from start to end of dests
 *
 * iteratively adds up distance for each index then adds distance from end to stat.
 * This method will compute the full distance of the cycle that starts
 * at the 'start' parameter, goes to each of the cities in the dests
 * vector IN ORDER, and ends back at the 'start' parameter.
 * @param me middle earth "world"
 * @param start starting city
 * @param dests vector of cities
 * @return returns total distance
 */
float computeDistance (MiddleEarth &me, string start, vector<string> dests) {
    // YOUR CODE HERE
    float distance = 0;
    for(int i=0;i<dests.size()-1;i++){
        distance+=me.getDistance(dests[i],dests[i+1]);
    }
    return me.getDistance(dests.back(),start) + distance;

}

// This method will print the entire route, starting and ending at the
// 'start' parameter.  The output should be of the form:
// Erebor -> Khazad-dum -> Michel Delving -> Bree -> Cirith Ungol -> Erebor
/** @brief This method will print the entire route
 *
 * This method will print the entire route, starting and ending at the
 * 'start' parameter.  The output should be of the form:
 * Erebor -> Khazad-dum -> Michel Delving -> Bree -> Cirith Ungol -> Erebor
 * @param start starting city
 * @param dests vector of cities
 */
void printRoute (string start, vector<string> dests) {
    cout<<start<<" -> ";
    for(int i=1;i<dests.size();i++){
        cout<<dests[i]<<" -> ";
    }
    cout<<start<<" ";
}