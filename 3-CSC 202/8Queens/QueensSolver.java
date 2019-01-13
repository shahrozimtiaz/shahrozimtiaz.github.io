 /**
 * This is my description of my QueensSolver Class. It figures out the 92 possible
 * arrangements of the queens.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 09/17/2017
 */
import java.io.*;
import java.util.*;

public class QueensSolver {

	public static void main(String[] args) throws IOException {
		int [][] board = new int[8][8]; //defaults to 0 everywhere...because java

		LinkStack<BoardState> history = new LinkStack();
		placeQueens(board,history);


	}//main

	public static void placeQueens(int[][] board,LinkStack<BoardState> history){
		int solutionNum = 0;		
		BoardState ss = new BoardState(-3,-3);

		while(solutionNum <92){

			for(int r=0;r<8;r++) {
				for(int c=0;c<9;c++) {
					if(c==8) {
						ss = history.pop();	

						for(int rr=ss.getRow()+1;rr<8;rr++) {
							for(int rc=0;rc<8;rc++) {
								board[rr][rc]=0;
							}
						}
						r= ss.getRow();
						c=-1;
						board[ss.getRow()][ss.getCol()]=-2;
						continue;
					}
					if(board[r][c] == -2) {
						continue;	
					}
					if(placementCheck(board,r,c))	{
						board[r][c]=-1;
						history.push(new BoardState(r,c));
						break;
					}
				}

			}
			solutionNum +=1;
			printBoard(board,solutionNum);
		}


	}

	public static boolean placementCheck(int[][] board, int r,int c) {
		boolean valid = true;
		/// col check
		for(int i = 0;i<8;i++) {
			if(board[i][c] == -1) {
				return valid = false;
			}
		}
		/// row check
		for(int i = 0;i<8;i++) {
			if(board[r][i] == -1) {
				return valid = false;
			}
		}
		/// dia check
		int dc =c;

		for(int dr = r;dr>=0;dr--) {
			if(dc<8) {
				if(board[dr][dc] == -1) {
					return valid = false;
				}
				dc++;
			}
		}
		
		 dc=c;
		
		for(int dr = r;dr>=0;dr--) {
			if(dc>=0) {
				if(board[dr][dc] == -1) {
					return valid = false;
				}
				dc--;
			}
		}
		
		dc=c;
		
		for(int dr = r;dr<8;dr++) {
			if(dc>=0) {
				if(board[dr][dc] == -1) {
					return valid = false;
				}
				dc--;
			}
		}
		
		dc=c;
		
		for(int dr = r;dr<8;dr++) {
			if(dc<8) {
				if(board[dr][dc] == -1) {
					return valid = false;
				}
				dc++;
			}
		}
		return valid;
	}
	public static void printBoard(int board[][],int solutionNum) {
		System.out.print("Soultion " + solutionNum + ":  ");
		for(int r=0;r<8;r++){
			for(int c=0;c<8;c++){
				if(board[r][c] == -1) {
					System.out.print( "( " + r + "," + c + " )" + ",   ");
				}
			}
		}
		System.out.println( "");
	}
}//class
