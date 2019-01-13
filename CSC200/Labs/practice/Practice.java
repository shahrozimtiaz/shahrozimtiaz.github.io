package practice;
import java.util.Scanner; 

	public class Practice
	{
		public static void main(String[] args)
		    {
			Scanner input = new Scanner(System.in);
			
			
			String name = input.nextLine();
			int s1 = name.indexOf(' ');
			String firstname = name.substring(0,s1);
			int s2 = name.indexOf(' ', s1+1);
			String middleName = name.substring(s1+1,s2);
			//int s3 = name.indexOf(' ', s2+1);
			String lastName = name.substring(s2+1);
			
			System.out.println(firstname + " " + middleName + " " + lastName + " ");
			

		
			
			
			System.out.println(firstname.charAt(0) + "." + middleName.charAt(0) + ". " + lastName);
			



		    }  // end main
		}  // end of class


