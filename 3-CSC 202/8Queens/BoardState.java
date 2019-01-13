 /**
 * This is my description of my BoardState Class. It keeps track of the position of the queen.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 09/17/2017
 */
public class BoardState{
	private int row,col;
	private int value;
	
	public BoardState(int r, int c){
		row=r;
		col=c;	
	}
	
	public int getRow(){return row;}
	public int getCol(){return col;}
}