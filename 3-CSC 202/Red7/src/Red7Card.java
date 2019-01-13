/**
 * This is my description of my Red7Card class. It has 7 methods.
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/21/2017
 */
public class Red7Card implements R7Comparable{

	private int number;
	private String color;
	
	public Red7Card(String clr, int num) {
		color = clr;
		number = num;
	}
	public int getNumber() {
		return number;
	}
	public String getColor() {
		return color;
	}
	public int getColorId() {
		return getColorInd();
	}
	public int getColorInd() {
	  return R7Comparable.getColorId(getColor());
	}
	public int compareTo(R7Comparable obj) {
		if(this.getOverallVal()>=obj.getOverallVal()) {
			return 1;
		}
		else return -1;
	}
	public String toString() {
		return getNumber() + getColor();
	}
	
}//class
