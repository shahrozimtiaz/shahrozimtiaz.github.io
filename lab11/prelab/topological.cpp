//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: topological.cpp
//Date:12/2/2018
// This program shows how C-based file I/O works.  It will open a
// file, read in the first two strings, and print them to the screen.

// included so we can use cout
#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <vector>
#include <list>
#include <string>
#include <queue>
using namespace std;

class vertex{
public:
    vertex(string data);
    ~vertex();
    void addEdge(vertex* node);

    list<vertex*> adjVertices;
    string datum;
    int inDegree;
};
/** @brief vertex constructor
*
*  This constructor creates the vertex node and initializes its values.
*  @param data the class you would like to assign to the vertex 
*/
vertex::vertex(string data){
    datum = data;
    inDegree=0;
}
/** @brief vertex destructor
*
*  This desrtuctor creates the clears list adjacent vertices and destroys them
*/
vertex::~vertex(){
	adjVertices.clear();
}
/** @brief Adds edge to adjacent vertix
* 
*  edge created from one vertex to the other
*  @param node the vertex that the edge leads to
*/
void vertex::addEdge(vertex* node){
    this->adjVertices.push_back(node);
    node->inDegree++;
}
/** @brief checks if current vertex has already been entered
* 
*  used to keep track of what has been pushed on to the vector of vertices.
*  no need to push a vertex that's already been added
*  @param vertices vector of veritices that have been already added
*  @param n the node you're determining the existence of
*  @return if vertex has already been pushed or not
*/
bool foundInvertices(vector<vertex*> vertices, vertex* n ){
    for(int i=0;i<vertices.size();i++){
        if(vertices[i]->datum==n->datum)
            return true;
    }
    return false;
}
/** @brief checks if current vertex has already been entered
* 
*  used to keep track of what has been pushed on to the vector of vertices.
*  no need to push a vertex that's already been added
*  @param vertices vector of veritices that have been already added
*  @param n the node you're determining the existence of but just uses the string that node is holding
*  @return if vertex has already been pushed or not
*/
bool foundInvertices(vector<vertex*> vertices, string n){ //never actually used (was an alternative)
    for(int i=0;i<vertices.size();i++){
        if(vertices[i]->datum==n)
            return true;
    }
    return false;
}
/** @brief prints a valid topological sort
* 
*  finds one valid topological sort and prints it out
*  @param vertices vector of veritices that were added
*/
void topSort(vector<vertex*> vertices){
    queue<vertex*> q;
    vertex* v;
    vertex* w;
    for(int i=0;i<vertices.size();i++){
        if(vertices[i]->inDegree==0){
            q.push(vertices[i]);
        }
    }
    while(!q.empty()){
        v = q.front();
        q.pop();
        cout<<v->datum<< " ";
        for (list<vertex*>::iterator it=v->adjVertices.begin(); it != v->adjVertices.end(); it++){
            w = *it;
            if(--w->inDegree==0){
                q.push(w);
            }
        }
    }
    cout<<endl;
}
/** @brief prints a valid topological sort
* 
*  finds one valid topological sort assuming the graph given is a directed acyclic graph and prints it out
*  @param argc # of arguements
*  @param argv array of arguements
*  @return 0 upon completion
*/
// we want to use parameters
int main(int argc, char **argv) {
    vector<vertex*> vertices;
    // verify the correct number of parameters
    if ( argc != 2 ) {
        cout << "Must supply the input file name as the one and only parameter" << endl;
        exit(1);
    }
    // attempt to open the supplied file
    ifstream file(argv[1], ifstream::binary);
    // report any problems opening the file and then exit
    if ( !file.is_open() ) {
        cout << "Unable to open file '" << argv[1] << "'." << endl;
        exit(2);
    }
    // read in two strings
    string s1,s2;
    file >> s1;
    file >> s2;
    while(s1 != "0" && s2 != "0"){
        vertex* n = new vertex(s1);
        vertex* n1 = new vertex(s2);
        if(!foundInvertices(vertices,n)){ //if n hasn't already been added, add it and then do the same with n1
            vertices.push_back(n);
            if(foundInvertices(vertices,n1)){
                for(int i=0;i<vertices.size();i++){
                    if(vertices[i]->datum==n1->datum){
                        vertices[vertices.size()-1]->addEdge(vertices[i]);  //connect the vertices via edge
                        // vertices[i]->inDegree++; //more optimal method used
                        break;
                    }
                }
            }else{
                vertices.push_back(n1);
                vertices[vertices.size()-2]->addEdge(vertices[vertices.size()-1]); //connect the vertice via edge
                // vertices[vertices.size()-1]->inDegree++;
            }
        }else{
            for(int i=0;i<vertices.size();i++){
                if(vertices[i]->datum==n->datum){ //if n has already been added, check the same with n1
                    if(foundInvertices(vertices,n1)){
                        for(int j=0;j<vertices.size();j++){
                            if(vertices[j]->datum==n1->datum){
                                vertices[i]->addEdge(vertices[j]); //connect the vertices via edge
                                // vertices[j]->inDegree++;
                                break;
                            }
                        }
                    }else{
                     vertices.push_back(n1);
                     vertices[i]->addEdge(vertices[vertices.size()-1]); //connect the vertices via edge
                     // vertices[vertices.size()-1]->inDegree++;
                     break;
                 }
             }
         }
     }
     file >> s1;
     file >> s2;
 }
  //   for(int i=0;i<vertices.size();i++){ //used for debugging
  //       vertex* itr = vertices[i];
  //       cout<<itr->datum<< " "<<itr->inDegree<<endl;
  //   } 
  //   cout<<endl;
  //   cout<<endl;
  // for(int j=0;j<vertices.size();j++){
  //   vertex* t = vertices[j];
  //   cout<<t->datum<<" "<<t->inDegree<<endl;
  //   for (list<vertex*>::iterator it=t->adjVertices.begin(); it != t->adjVertices.end(); it++){
  //           vertex* w = *it;
  //     cout<<w->datum<<" "<<w->inDegree<<endl;
  //   }
  //   cout<<endl;
  // }
   topSort(vertices);
    // string comparison done with ==, but not shown here
    // close the file before exiting
   file.close();
   for(int i=0;i<vertices.size();i++){
   	delete vertices[i];
   }
   vertices.clear(); 
   return 0;
}//main