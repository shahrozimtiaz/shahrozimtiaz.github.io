package pets.kingdoms;

public class Animal{
	protected int foodLvl;
	public static final int fullAmt = 10;

	public Animal(){
		foodLvl = 10;
	}
    
    protected boolean isStarved(){
        if(foodLvl < 0){
            System.out.print(super.toString()+" is dead");
            return true;
        }
        return false;
    }
    
    public void play(){
        System.out.print("You attempt to play with a wild animal...that was unwise");
    }

	public void timePassed(){
		foodLvl--;
        isStarved();
	}

	public void feed(){
		if(!isStarved())
            foodLvl = Animal.fullAmt;
	}

	@Override
	public String toString(){
		if(isStarved())
			return "";
		else{	
            String txt = super.toString()+"(hunger):";
            for(int i=0; i<30-txt.length(); i++) txt+=" ";
            txt+="\t";
			for(int i=0; i<10-foodLvl; i++) txt += "X";
			for(int i=0; i<foodLvl; i++) txt += "_";
            return txt;
		}
	}
}
