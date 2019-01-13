import java.util.*;

/**
 * This is my description of my Recursion Class. It determines the values of a binary number and also the GCD of two positive integers.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/1/2017
 */
public class Recursion{
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		System.out.print("%nEnter a binary number: ");
		String input = scn.nextLine();
		System.out.printf("%n%-10s - using checkString results in: %6d%n",input,checkString(input));
		System.out.printf("%-10s - using checkString2 results in: %5d%n",input,checkString2(input));

		System.out.printf("%n%-10s - using checkStringNR results in: %4d%n",input,checkStringNR(input));
		System.out.printf("%-10s - using checkStringNR2 results in: %3d%n",input,checkStringNR2(input));
		System.out.println("\n--------------------------------");

		int num1 = promptForPosInteger(scn);
		int num2 = promptForPosInteger(scn);
		System.out.printf("%nThe GCD between %d and %d is %8d%n", num1, num2, GCD(num1,num2));
		System.out.printf("The GCD(NR) between %d and %d is %4d%n%n", num1, num2, GCD_NR(num1,num2));
	}

	/**
	 * My method for getting an integer, enforcing the fact it is a positive integer.
	 */
	public static int promptForPosInteger(Scanner s){
		System.out.print("Enter a positive integer: " );
		String entered = s.nextLine();
		while(!entered.matches("\\d+")){
			System.out.print("That is not a positve integer, try again: ");
			entered = s.nextLine();
		}
		return Integer.parseInt(entered);
	}



	/**********************************************************************
	 * A recursive method that does something... TODO: fill in details
	 * Preconditions:a binary string must be passed in 
	 * Postconditions: returns an integer value that is increased by 1 if the char at any index of the binary string is '0'. 
	 * Base Case: if the string length is zero return zero
	 * Smaller Case: the string is reduced by one in terms of length each recursion
	 * General Case: assuming my recursive call is correct, the post condition still holds.
	 */
	public static int checkString(String s){
		int v = 0;
		if(s.length()==0) return 0;
		if(s.charAt(0)=='1'){
			s+="00";
			v+=checkString(s.substring(1));
		}else {
			v++;
			v+=checkString(s.substring(1));
		}
		return v;
	}

	/**
	 * TODO: Write non-recursive code that returns the same result as above (DONE!)
	 */
	public static int checkStringNR(String s){
		int v = 0;    
		while(s.length()!=0) {
			if(s.charAt(0)=='1'){
				s+="00";
				s = s.substring(1);
			}else {
				v++;
				s= s.substring(1);
			}
		}
		return v;
	}



	/**********************************************************************
	 * A recursive method that does something... TODO: fill in details
	 * Preconditions:a binary string must be passed in 
	 * Postconditions:returns an integer value which is calculated by adding 1 to the value if the char at any index of the binary string is '0
	 * 	and multiplying the current value by 2 then adding one if the char is '1'.
	 * Base Case: if the string length is zero return zero
	 * Smaller Case: the string is reduced by one in terms of length each recursion
	 * General Case: assuming my recursive call is correct, the post condition still holds.
	 */
	public static int checkString2(String s){
		int v=0;

		if(s.length()==0) return 0;
		if(s.charAt(0)=='1'){
			v+=checkString2(s.substring(1))+1;
		} else {
			v+=1;
		}
		v+=checkString2(s.substring(1));
		return v;
	}

	/**
	 * TODO: Write non-recursive code that returns the same result as above
	 */
	public static int checkStringNR2(String s){

		int v=0;

		for(int i = s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='1') {
				v= 2*v+1;
			}
			else {
				v++;
			}
		}
		return v;
	}


	public static int NRCheck2(String o, int v) {
		String q = o;

		while(q.length()!=0) {
			if(q.charAt(0)=='1'){
				v++;
				q=q.substring(1);

			}else {
				v++;
				q = q.substring(1);
			}

		}
		return v;
	}




	/**********************************************************************
	 * A recursive method that computes the greatest common divisor
	 */
	public static int GCD(int a, int b){
		//TODO: modify method body so you compute the GCD using euclid's algorithm

		if(b==0)return a;
		a = GCD(b,a%b);
		return a;
	}

	/**
	 * TODO: Write non-recursive code that returns the same result as above
	 */
	public static int GCD_NR(int a, int b){
		int tracker=0;
		int n=0;
		if(b==0)return a;
		if(a==0)return b;
		if(a>=b) n=a;
		else n=b;

		for(int i=n;i>0;i--) {
			if(a%i==0 && b%i==0) {
				tracker=i;
				break;
			}
		}
		return tracker;
	}
}