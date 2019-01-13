package chapter4;

public class Project8 {

	public static void main(String[] args) 
	{

		{
		int a = (int) (Math.random() *10) +1;
		int b = (int) (Math.random() *10) +1;
		int c = (int) (Math.random() *10) +1;
		
		while(a==b)
		{
			b = (int) (Math.random() *10) +1;
		}
		while(a==c)
		{
			a = (int) (Math.random() *10) +1;
		}

		while(b==c)
		{
			c = (int) (Math.random() *10) +1;
		}
		
		System.out.println("The finalists are:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		}
		

	}

}
