package pets;
import java.security.SecureRandom;

public class Dog extends Pet{
	public Dog(String name){
		super(name);
		amtToEat=3;
	}
	
	@Override
	public void play(){
		SecureRandom sr = new SecureRandom();
		play(sr.nextInt(3));
	}

	public void play(int i){
		switch(i){
			case 0:
				System.out.print("You play fetch together");
				break;
			case 1:
				System.out.print("You go for a run together");
                break;
			case 2:
				System.out.print("You train for an agility course");
				break;
			default:
				System.out.print("They nap instead");
				
		}
	}
}
