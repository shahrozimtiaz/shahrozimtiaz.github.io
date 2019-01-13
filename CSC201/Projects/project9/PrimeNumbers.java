package project9;
import java.util.*;


public class PrimeNumbers {

	public static void main(String[] args) 
	{
		boolean primeNum1;
		boolean primeNum2;

		int otherFactor;

		List<Integer> primeFactors;
		String answer;
		String cont = "yes";

		Scanner scan = new Scanner(System.in);

		while(cont.equals("yes"))
		{
			
			primeNum1 = true;

			primeFactors = new ArrayList<Integer>();
			
			answer = "Prime";
			int num = scan.nextInt();
			
			if(num<2)
			{
				System.out.println("lowest prime number is 2");
				continue;
			}
//////////////////////////////////////////////////////////////////////////////////////////////
			for(int i=2;i*i<=num;i++)
			{ 
				
				if(num % i == 0) // big if
				{
					answer = "not prime";
					
					for(int x=2;x*x<=i;x++)
					{

						if(i % x ==0)
						{
							primeNum1 = false;
						}
						
					}
					if(primeNum1)
					{
						primeFactors.add(i);
					}
					num = num/i;
					i=1;					
					
				}// big if
			}// for loop
			primeFactors.add(num);

			System.out.println(answer);
			if(answer.equals("not prime"))
			{
				System.out.print("Prime Factors are: " );
				for(int i=0;i<=primeFactors.size()-1;i++)
				{
					int temp = primeFactors.get(i);
					System.out.print(temp);
					if(i<primeFactors.size()-1)
					{
						System.out.print(", ");
					}
				}
			}
		}
	}//main

}//class
