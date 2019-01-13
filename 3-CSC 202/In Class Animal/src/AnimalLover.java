import java.util.*;
import pets.*;
import pets.kingdoms.*;

public class AnimalLover{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		Animal[] animals = new Animal[4];
		animals[0] = new Animal();
		animals[1] = new Pet("Jacques");
		animals[2] = new Dog("Dug");
		animals[3] = new Cat("Garfield");
		
		System.out.println("Welcome to Animal Control Station");
		boolean done=false;

		while(!done){
            System.out.println("\n\n\n\n\n");
			for(int i=0; i<animals.length; i++)
				System.out.println((char)(i+65)+") "+animals[i]);

			System.out.println("\n0) Play");
			System.out.println("1) Feed");
			System.out.println("2) Quit");
			System.out.print("What should you like to do? ([ABCD][01]|2)");
			String input = scn.nextLine().toUpperCase();
			while(!input.matches("[ABCD][012]|2")){
				System.out.println("Must match the regular expression \"[ABCD][01]|2\", try again:"); 
				input = scn.nextLine().toUpperCase();
			}
            
            if(input.length()==1 || input.charAt(1)=='2'){
                done=true;
            } else {
                for(int i=0; i<animals.length; i++)
                    animals[i].timePassed();
                
                System.out.println();
        
                int anInd = input.charAt(0)-65;
                if(input.charAt(1)=='0')
                    animals[anInd].play();
                if(input.charAt(1)=='1')
                    animals[anInd].feed();
                
                System.out.print("\nPress [Enter] to continue...");
                input = scn.nextLine();
            } //end input check
        	
		}//end main loop
		scn.close();
	} //end main method
}//end class
