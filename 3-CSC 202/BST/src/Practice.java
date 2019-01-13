import java.util.*;

public class Practice {

	public static void main(String[] args) {
		double e3=0;
		double e4=0;
		
		double e1 = 90;
		double e2= 78;
		
		
		for(e3=60;e3<=100;e3++) {
			for(e4=60;e4<=100;e4++) {
				double x = (e1+e2+e3+(e4*2))/500*100;
				if( x >= 89.5) {
					System.out.println((e1 + "" + e2 + "" +e3 + "" +e4 + ""));
					System.exit(0);
				}
				
			}
		}

	}

}
