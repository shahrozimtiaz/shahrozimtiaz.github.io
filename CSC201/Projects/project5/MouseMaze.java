//package project5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MouseMaze 
{
	static DecimalFormat numberFormat = new DecimalFormat("###,###,###,###");
	
	private static int[][] mouseArray;
	static int rowSize;
	static int columnSize;
	static int move;
	static int location = 0;
	static int mouseRow = 0;
	static int mouseColumn = 0;
	static int catRow = 0;
	static int catColumn = 0;
	static int boardCount;
	static int catCount;
	static int fallOffMazeCount;
	static boolean goodMove;

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String choice = "continue";
		
		while(choice.equalsIgnoreCase("continue"))
		{
			System.out.println("Enter the size of the maze.");
			System.out.println("How many rows?");
			rowSize = scan.nextInt();
			System.out.println("How many columns?");
			columnSize = scan.nextInt();
			mouseArray = new int[rowSize][columnSize];
			move = 1;
			boardCount = 0;
			catCount = 0;
			mouseArray[0][0] = move;
			location = 0;
			mouseColumn = 0;
			fallOffMazeCount = 0;
			
			while(location != rowSize -1 + columnSize -1)
			{
				int nextMove = (int)((Math.random()*8) + 1);
				switch(nextMove)
				{
					case 4:
						mouseRow = mouseRow-1;
						mouseColumn = mouseColumn + 1;
						if(mouseRow<0 || mouseColumn == columnSize || mouseArray[mouseRow][mouseColumn]!=0)
						{
							if(mouseRow<0 || mouseColumn == columnSize)
							{
								fallOffMazeCount++;
								startOver();
							}
						}
						else
						{
							goodMove = true;
							location = mouseRow + mouseColumn;
							move++;
							mouseArray[mouseRow][mouseColumn] = move;
						}
						break;
					case 5:
						mouseColumn = mouseColumn + 1;
						if( mouseColumn == columnSize || mouseArray[mouseRow][mouseColumn]!=0)
						{
							if( mouseColumn == columnSize)
							{
								fallOffMazeCount++;
								startOver();
							}
						}
						else
						{
							goodMove = true;
							location = mouseRow + mouseColumn;
							move++;
							mouseArray[mouseRow][mouseColumn] = move;
						}
						break;
					case 6:
						mouseRow = mouseRow + 1;
						mouseColumn = mouseColumn + 1;
						if(mouseRow == rowSize || mouseColumn == columnSize || mouseArray[mouseRow][mouseColumn]!=0)
						{
							if(mouseRow == rowSize || mouseColumn == columnSize)
							{
								fallOffMazeCount++;
								startOver();
							}
						}
						else
						{
							goodMove = true;
							location = mouseRow + mouseColumn;
							move++;
							mouseArray[mouseRow][mouseColumn] = move;
						}
						break;
					case 7:
						mouseRow = mouseRow + 1;
						
						if(mouseRow == rowSize || mouseArray[mouseRow][mouseColumn]!=0)
						{
							if(mouseRow == rowSize)
							{
								fallOffMazeCount++;
								startOver();
							}
						}
						else
						{
							goodMove = true;
							location = mouseRow + mouseColumn;
							move++;
							mouseArray[mouseRow][mouseColumn] = move;
						}
						break;
					case 8:
						mouseRow = mouseRow+1;
						mouseColumn = mouseColumn - 1;
						if(mouseRow == rowSize || mouseColumn < 0 || mouseArray[mouseRow][mouseColumn]!=0)
						{
							if(mouseRow == rowSize || mouseColumn < 0)
							{
								fallOffMazeCount++;
								startOver();
							}
						}
						else
						{
							goodMove = true;
							location = mouseRow + mouseColumn;
							move++;
							mouseArray[mouseRow][mouseColumn] = move;
						}
						break;
					default:
						startOver();
						break;
				}//switch
				if(goodMove)
				{
					getCat();
				}
			}//while
			printMaze();

		}//while
	}//main
	private static void startOver()
	{
		mouseArray = new int[rowSize][columnSize];
		move = 1;
		boardCount++;
		mouseArray[0][0] = move;
		location = 0;
		mouseRow = 0;
		mouseColumn = 0;
	}
	private static void getCat()
	{
		getCatsTwoRandomNumbers();
		if(catGotMouse())
		{
			catCount++;
			startOver();
		}
	}
	private static boolean catGotMouse()
	{
		if(catRow == mouseRow && catColumn == mouseColumn)
			return true;
		else if(catRow + 1 == mouseRow && catColumn == mouseColumn)
			return true;
		else if( catRow == mouseRow && catColumn + 1 == mouseColumn)
			return true;
		else if(catRow + 1 == mouseRow && catColumn + 1 == mouseColumn)
			return true;
		return false;
	}
	private static void getCatsTwoRandomNumbers()
	{
		catRow = (int)((Math.random() * rowSize));
		catColumn = (int)((Math.random() * columnSize));			
	}
	private static void printMaze()
	{
		int move;
		String boardNumber = numberFormat.format(boardCount);
		String catNumber = numberFormat.format(catCount);
		String fallOffMazeNumber = numberFormat.format(fallOffMazeCount);
		System.out.println("It took " + boardNumber + " attempts to find a path.");
		System.out.println("The mouse fell off the maze " + fallOffMazeNumber + " times.");
		System.out.println("The cat got the mouse " + catNumber + " times.");
		placeCatInMaze();
		for(int row = 0; row<rowSize; row++)
		{
			for(int col = 0; col < columnSize; col++)
			{
				move = mouseArray[row][col];
				if(move>9)
					System.out.print(" " + move);
				else if(move == -1)
					System.out.print("  " + "C");
				else System.out.print("  " + move);
			}
			System.out.println();
		}	
	}
	private static void placeCatInMaze()
	{
		if(catRow<rowSize && catColumn<columnSize)
			mouseArray[catRow][catColumn] =  -1;
		if(catRow + 1<rowSize && catColumn < columnSize)
			mouseArray[catRow + 1][catColumn] = -1;
		if(catRow< rowSize && catColumn +1  < columnSize)
			mouseArray[catRow][catColumn + 1] = -1;
		if(catRow + 1 < rowSize && catColumn + 1 < columnSize)
			mouseArray[catRow + 1][catColumn + 1] = -1;
	}

}//class
