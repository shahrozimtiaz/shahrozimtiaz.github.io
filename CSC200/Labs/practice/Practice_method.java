package practice;
import java.util.Scanner;
public class Practice_method {

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int num1= input.nextInt();
	int num2= input.nextInt();
	int num3 = input.nextInt();
	int num4 = input.nextInt();
	
	int max = maxInt(num1,maxInt(num2,maxInt(num3,num4)));
	System.out.println(max);

	}//main
	
	public static int maxInt(int num1, int num2)
	{
		
		if(num1>num2)
		{
			return num1;
		}
		else 
		{
			return num2;
		}
	}

}//class
