/**
 * This is my description of "my" GridBoard class. I did the constructGraph() method.
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 12/10/2017
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.security.SecureRandom;

public class GridBoard extends JPanel implements MouseListener{
	
	private Spot[] allSpots;
	private int starting, goal;	
	private Graph<Spot> myGraph;
	private Spot roboSpot, goalSpot;
	
	//0-5 for both
    public GridBoard() {
		setPreferredSize(new Dimension(720,720));
		this.setLayout(new GridLayout(6,6));
		
		allSpots = new Spot[36];
		
		SecureRandom sr = new SecureRandom();
		
		GridTile gt1 =new GridTile(false,0,sr);
		GridTile gt2 =new GridTile(false,1,sr);
		GridTile gt3 =new GridTile(false,2,sr);
		GridTile gt4 =new GridTile(false,3,sr);		
    
		int i=0;
		for(int r=0; r<3; r++){
			for(int c=0; c<3; c++) this.addSpot(gt1.get(r,c),i++);
			for(int c=0; c<3; c++) this.addSpot(gt2.get(r,c),i++);
		}
		for(int r=0; r<3; r++){
			for(int c=0; c<3; c++) this.addSpot(gt3.get(r,c),i++);
			for(int c=0; c<3; c++) this.addSpot(gt4.get(r,c),i++);
		}
		goal = starting = sr.nextInt(36);
		while(goal==starting){goal = sr.nextInt(36);}
		roboSpot = allSpots[starting];
		roboSpot.setIsRobot(true);
		goalSpot = allSpots[goal];
		goalSpot.setIsTarget(true);
		
		constructGraph();
	}
	
	private void addSpot(Spot s, int ind){
		allSpots[ind]=s;
		s.addMouseListener(this);
		this.add(s);
	}
	
	
	///////////////////////////////////////////////////////////////
	//
	// TODO: Complete Graph Code Below
	//
	///////////////////////////////////////////////////////////////
	
	public void constructGraph(){
		myGraph = new Graph();

		for(int i =0;i<=35;i++) {
			myGraph.addVertex(allSpots[i]);
		}

		for(int i =0;i<=35;i++) {
			int th = i;
			while(th%6!=0) {
				th--;
			}
			for(int h=th;h<=th+5;h++) {
				if(h!=i) {
					if(allSpots[i].equals(allSpots[h])) {		
						myGraph.addEdge(allSpots[i], allSpots[h]);
					}
				}
			}
			int tv=i;
			while(tv-6>0) {
				tv=tv-6;
			}
			for(int v=tv;v<36; v=v+6) {
				if(v!=i) {
					if(allSpots[i].equals(allSpots[v])) {		
						myGraph.addEdge(allSpots[i], allSpots[v]);
					}
				}
			}
		}

		//Add verticies that store the Spot objects
		//Add edges to connect spots that share a property along an orthogonal direction

		//This is the ONLY time it is ok to iterate the array.
		
		//myGraph.addVert(...);
		//myGraph.addEdge(...);
	}
	
	///////////////////////////////////////////////////////////////////
	// No Other code needs to be modified...
	
	public void mouseClicked(MouseEvent e){
		if (e.getButton() == MouseEvent.BUTTON1){
			boolean b = myGraph.isAdjacent(roboSpot,(Spot)e.getSource()); 
			System.out.print(e.getSource()+" Clicked and it is");
			if(!b) System.out.print(" not");
			System.out.println(" adjacent");
		} else { //a different button was clicked...
			ArrayList<Spot> sequence = myGraph.getShortestPath(roboSpot,goalSpot);
			
			for(int i=0; i<sequence.size(); i++){
				sequence.get(i).setSeqInd(i+1);
			}
		}
		this.revalidate();
		this.repaint();
	}
	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	
	///////////////////////////////////////////////////////////////////
	
	private class GridTile{
		int[][] sSpotNum={{4,6,4,2,2,2,1,1,2},
						  {1,6,1,5,5,5,6,1,1},
						  {3,3,3,2,4,5,5,6,4},
						  {2,3,5,6,4,4,6,3,3}}; // start at 1
		int[][] sSpotCol={{0,3,4,5,3,0,2,0,1},
						  {4,1,1,1,2,5,4,5,3},
						  {4,1,3,4,5,3,4,5,2},
						  {2,0,0,2,1,3,0,5,2}}; // start at 0 
						  
		ArrayList<Spot> spotSet;
		
		public GridTile(boolean isGold, int tileNum,SecureRandom sr){
			int starting = sr.nextInt(4);//0-3, 4 valid rotations
			int curr=0;
			spotSet = new ArrayList();
			
			if (starting==0){
				while(curr<9){
					spotSet.add(new Spot(sSpotNum[tileNum][curr]-1,sSpotCol[tileNum][curr]));
					curr++;
				}
			} else if (starting==1){
				curr=6;
				while(curr<9){
					spotSet.add(new Spot(sSpotNum[tileNum][curr]-1,sSpotCol[tileNum][curr]));
					curr-=3;
					if(curr<0) curr+=10;
				}
			} else if (starting==2){
				curr=2;
				while(curr>=0){
					spotSet.add(new Spot(sSpotNum[tileNum][curr]-1,sSpotCol[tileNum][curr]));
					curr+=3;
					if(curr>8) curr-=10;
				}
			} else {
				curr=8;
				while(curr>=0){
					spotSet.add(new Spot(sSpotNum[tileNum][curr]-1,sSpotCol[tileNum][curr]));
					curr--;
				}
			} 
		}
		
		public Spot get(int r, int c){
			return spotSet.get(r*3+c);
		}
		
	}

}