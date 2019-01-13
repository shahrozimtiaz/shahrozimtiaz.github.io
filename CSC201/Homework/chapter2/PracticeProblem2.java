
package chapter2;

import java.util.Scanner; 


public class PracticeProblem2 {

	public static void main(String[] args)
	{
		Scanner data = new Scanner(System.in);
		
		String one = data.nextLine();
		String two = data.nextLine();
		
		int stringLengthOne = one.length();
		int stringLengthTwo = two.length();
		
		System.out.println(one + " |The Length of String One is: " + stringLengthOne);
		System.out.println(two + " |The Length of String Two is: " + stringLengthTwo);
		
		String three = one + " " + two;
		
		int stringLengthThree = three.length();
		
		System.out.println(three + " |The Length of String Three is: " + stringLengthThree);
		
		
		data.close();
		
		
		

	}

}
