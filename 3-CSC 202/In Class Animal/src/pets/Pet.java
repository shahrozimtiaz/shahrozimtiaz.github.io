package pets;
import pets.kingdoms.Animal;

public class Pet extends Animal{
	private String name;
    protected int amtToEat;

	public Pet(String newName){
        super();
		name = newName;
        amtToEat = 1;
	}
    
    @Override
    protected boolean isStarved(){
        if(foodLvl < 0){
            System.out.print(name+" is dead");
            return true;
        }
        return false;
    }
    
    @Override
    public void play(){
        System.out.print(name+" doesn't do much...you might want to teach it some tricks");
    }
    
    @Override
    public void timePassed(){
        foodLvl-=amtToEat;
        isStarved();
    }
    
    @Override
    public String toString(){
        if(isStarved())
            return "";
        else{
            String txt = name+"(hunger):";
            for(int i=0; i<30-txt.length(); i++) txt+=" ";
            txt+="\t";
            for(int i=0; i<10-foodLvl; i++) txt += "X";
            for(int i=0; i<foodLvl; i++) txt += "_";
            return txt;
        }
    }
}
