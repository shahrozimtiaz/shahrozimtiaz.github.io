/**
 * This is my description of "my" Graph class. This is where the method for adding edges to adjacent vertices is. This is also where the getShortestPath is. 
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 12/10/2017
 */
import java.util.*;

///////////////////////////////////////////////////////////////
//
// TODO: Complete Graph Code Below
//
///////////////////////////////////////////////////////////////

public class Graph<T>{
	//Need Structure to Hold verts, edges (Must complete methods)
	int z=0;
	public ArrayList<T> verts = new ArrayList<T>(); 
	
	public int[][] edges = new int[36][36];

	
	//Precondition: data will become a new vertex...data is not null (DONE)
	//Postcondition: data will get added to the graph with no edges in or out.
	public void addVertex(T data){
		if(data == null) {
			
		}
		else {
		
		verts.add(data);	
	
		}
	
	}
	
	//Precondition: v1 and v2 are vertices of the graph
	//Postcondition: will construct an edge between v1 and v2, will be undirected.
	public void addEdge(T v1, T v2){
		int index1 = -1;
		int index2 = -1;
		if(verts.contains(v1) && verts.contains(v2)) {
			for(int i=0;i<=verts.size();i++) {
				if(myEquals(v1,verts.get(i))){
					index1 = i;	
					break;
				}
			}
			for(int i=0;i<=verts.size();i++) {
				if(myEquals(v2,verts.get(i))){
					index2 = i;	
					break;
				}
			}	

			edges[index1][index2]=1;
			edges[index2][index1]=1;
			

		}
	}
	public static boolean myEquals(Object tobj,Object obj){
		if(obj instanceof Spot){
			Spot t = (Spot)tobj;
			Spot s = (Spot)obj;
			return s.getDieVal()==t.getDieVal() && s.getClrNum()==t.getClrNum(); // matches either or....
		}
		return false;
	}

	//Precondition: source and sink are vertices of the graph
	//Postcondition: returns an iteratable list such that following the path from 0 -> n will take us from the source to the sink. The source and the sink may/may not be in the sequence. 
	public ArrayList<T> getShortestPath(T source, T sink){ 
		ArrayList answersR = new ArrayList();
		ArrayList answers = new ArrayList();

		int[] visited = new int[verts.size()];
		for(int i=0; i<visited.length; i++) visited[i] = 0;

		Queue<ItemNode> discoveredVerts = new LinkedList<>();

		ItemNode<T> root;
		ItemNode<T> parentNode;

		int index1 = -1;
		for(int i=0;i<=verts.size();i++) {    //gets index of source
			if(myEquals(source,verts.get(i))){
				index1 = i;	
				break;
			}
		}
		root = new ItemNode((index1));

		discoveredVerts.add(root);

		while( !discoveredVerts.isEmpty() ){

			parentNode =  discoveredVerts.remove();

			int cInd = (int) parentNode.getData();

			if (myEquals(verts.get(cInd),sink)) {
				while(parentNode != null) {
					answersR.add(parentNode.getData());
					parentNode = parentNode.getParent();
				}
				break;
			}
			visited[cInd]=1; //visit our ind first

			for(int j = 0; j < verts.size(); j++) {
				if(edges[cInd][j]==1 && visited[j]!=1) {
					ItemNode<T> tempNode = new ItemNode(j);

					tempNode.setParent(parentNode);

					discoveredVerts.add(tempNode);
				}
			}
		}
		while(answersR.size()!=0) {
			answers.add(verts.get((int) answersR.get(answersR.size()-1)));
			answersR.remove(answersR.remove(answersR.size()-1));
		}
		return answers;
	}


	//Precondition: v1 and v2 are vertices of the graph
	//Postcondition: returns true if there is an edge from v1 to v2, false otherwise
	public boolean isAdjacent(T v1, T v2){
		int index1 = -1;
		int index2 = -2;
		if(verts.contains(v1) && verts.contains(v2)) {
			for(int i=0;i<=verts.size();i++) {
				if(myEquals(v1,verts.get(i))){
					index1 = i;	
					break;
				}
			}
			for(int i=0;i<=verts.size();i++) {
				if(myEquals(v2,verts.get(i))){
					index2 = i;	
					break;
				}
			}
			if(edges[index1][index2]==1) {
				return true;
			}
			else return false;
			}
			else return false;
	}

	
	public void testEdgesMatrix() {
		for(int i = 0; i<verts.size(); i++)
		{
			if(i<10) {
			 System.out.print("0" + i + ":");
			}
			else {
				System.out.print(i + ":");
			}
		    for(int j = 0; j<verts.size(); j++)
		    {
		        System.out.print(edges[i][j]);
		    }
		    System.out.println();
		   

		}
	}

}
