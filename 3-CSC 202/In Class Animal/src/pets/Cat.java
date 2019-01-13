 /**
 * This is my description of my Cat class. It has 3 methods.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 08/26/2017
 */
/*
 1) Over ridden method (pet, timePassed). Overload method (Dog, play() & play(int i))
 2) 1. overriding from the object class.
 3) Polymorphism
 4) n^2
 5) n^2
 */
package pets;

public class Cat extends Pet {
	
		private String furColor;
		
		public Cat(String name){
			super(name);
			amtToEat = 2;
			setFColor("black");
		}
		
		public void play(){
			System.out.println("A " + this.getFColor() + " cat just stares at you incredulously");
			
		}
		
		public void setFColor(String desiredColor ){
			this.furColor = desiredColor;
		}
		
		public String getFColor( ){
			return this.furColor;
		}
	

}//class
