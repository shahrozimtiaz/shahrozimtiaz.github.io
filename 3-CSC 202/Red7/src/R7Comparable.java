/**
 * This is my description of my R7Comparable interface. It has 4 methods.
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/21/2017
 */
public interface R7Comparable extends Comparable<R7Comparable>{
	
	public static int getColorId(String color){
		switch(color.toUpperCase()){
            case("R"):
            case "RED": return 7;
			case("O"):
            case "ORANGE": return 6;
			case("Y"):
            case "YELLOW": return 5;
			case("G"):
            case "GREEN": return 4;
			case("B"):
            case "BLUE": return 3;
			case("I"):
            case "INDIGO": return 2;
            case("V"):
			case "VIOLET": return 1;
		}
		return 0;
	}
    public int getNumber();
    public int getColorInd();
    
    public default int getOverallVal(){
        return getColorInd()+getNumber()*7;
    }
}