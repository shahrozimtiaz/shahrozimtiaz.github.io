/**
 * This is my description of my Red7CardSet class. It has 7 methods and 7 helper methods.
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/21/2017
 */
import java.util.ArrayList;
import java.util.List;

public class Red7CardSet {
	List<Red7Card> cards;
	
	public Red7CardSet() {
		cards = new ArrayList<Red7Card>();
	}
	public void add(Red7Card rc) {
		cards.add(rc);
	}
	public int getSize() {
		return cards.size();
	}
	public void remove(Red7Card rc) {
		cards.remove(rc);
	}
	public Red7Card get(int index) {
		return cards.get(index);
	}
	public int compareRule(Red7CardSet rs, String color) {
		
		switch(color.toUpperCase()){
        case("R"):
        case "RED": return compareRed(rs);
		case("O"):
        case "ORANGE": return compareOrange(rs);
		case("Y"):
        case "YELLOW": return compareYellow(rs);
		case("G"):
        case "GREEN": return compareGreen(rs);
		case("B"):
        case "BLUE": return compareBlue(rs);
		case("I"):
        case "INDIGO": return compareIndigo(rs);
        case("V"):
		case "VIOLET": return compareViolet(rs);
			
	}
		return 0;
}
	
	private int compareViolet(Red7CardSet rs) {
		int t=0;
		int o=0;
		
		for(Red7Card x: this.cards) {
			if(x.getNumber()<4) t++;
		}
		for(Red7Card x: rs.cards) {
			if(x.getNumber()<4) o++;
		}
		
		if(t<o) return -1;
		if(t>o) return 1;
		if(t==o){
				int tov = 0;
				int oov = 0;
				
				for(Red7Card x: this.cards) {
					if(x.getOverallVal()>=tov && x.getNumber()<4) {
						tov = x.getOverallVal();
					}
				}
				for(Red7Card x: rs.cards) {
					if(x.getOverallVal()>=oov && x.getNumber()<4) {
						oov = x.getOverallVal();
					}
				}
				if(tov<oov) return -1;
				if(tov>oov) return 1;
				if(tov==oov) return 0;
				
				return -2;
			}
		return -2;	
		
	}
	private int compareIndigo(Red7CardSet rs) {
		int[] tv = new int[20];
		int[] ov = new int[20];
		
		int ai=0;
		
		int t=0;
		int o=0;
		
		int na=1;
		
		for(int i = 0;i<this.cards.size();i++){
			for(int ii=i+1;ii<this.cards.size();ii++) {
				if(this.cards.get(i).getNumber()+na == this.cards.get(ii).getNumber()){
					t++;
				}
				else {
					ai++;
		
					t=0;
				}
				tv[ai] = t;
				na++;
			}
		}
		t=0;
		ai = 0;
		na = 1;
		
		for(int i = 0;i<rs.cards.size();i++){
			for(int ii=i+1;ii<rs.cards.size();ii++) {
				if(rs.cards.get(i).getNumber()+na == rs.cards.get(ii).getNumber()){
					o++;
				}
				else {
					ai++;
					ov[ai] = o;
					o=0;
				}
				ov[ai] = o;
				na++;
			}
			na=1;
		}
		ai=0;
		o=0;
		na=1;
		for(int i = 0;i<this.cards.size();i++){
			for(int ii=i+1;ii<this.cards.size();ii++) {
				if(this.cards.get(i).getNumber() == (this.cards.get(ii).getNumber()+na)){
					t++;
				}
				else {
					ai++;
					t=0;
				}
				tv[ai] = t;
				na++;
			}
			na=1;
		}
		t=0;
		ai = 0;
		na=1;
		
		for(int i = 0;i<rs.cards.size();i++){
			for(int ii=i+1;ii<rs.cards.size();ii++) {
				if(rs.cards.get(i).getNumber() == rs.cards.get(ii).getNumber()+na){
					o++;
				}
				else {
					ai++;
					o=0;
				}
				ov[ai] = o;
				na++;
			}
			na=1;
		}
		na=1;
		o=0;
		
		for(int i = 0;i<tv.length;i++) {
			if(tv[i] >= t) t = tv[i];
		}
		for(int i = 0;i<ov.length;i++) {
			if(ov[i] >= o) o = ov[i];
		}
			
		if(t<o) return -1;
		if(t>o) return 1;
		if(t==o) return compareRed(rs);
		
		return -2;
		
	}
	private int compareBlue(Red7CardSet rs) {
		int t=0;
		int o=0;
		
		for(int i = 0;i<this.cards.size();i++){
			for(int ii=i+1;ii<this.cards.size();ii++) {
				if(this.cards.get(i).getColor().equals(this.cards.get(ii).getColor())){
					
				}
				else{
					t++;
				}
			}
		}
		for(int i = 0;i<rs.cards.size();i++){
			for(int ii=i+1;ii<rs.cards.size();ii++) {
				if(rs.cards.get(i).getColor().equals(rs.cards.get(ii).getColor())){
					
				}
				else {
					o++;
				}
			}
		}
		if(t<o) return -1;
		if(t>o) return 1;
		if(t==o) return compareRed(rs);
		
		return -2;
		
	}
	private int compareGreen(Red7CardSet rs) {
		int t=0;
		int o=0;
		
		for(Red7Card x: this.cards) {
			if(x.getNumber()%2==0) t++;
		}
		for(Red7Card x: rs.cards) {
			if(x.getNumber()%2==0) o++;
		}
		
		if(t<o) return -1;
		if(t>o) return 1;
		if(t==o) {
			int tov = 0;
			int oov = 0;
			
			for(Red7Card x: this.cards) {
				if(x.getOverallVal()>=tov && x.getNumber()%2==0) {
					tov = x.getOverallVal();
				}
			}
			for(Red7Card x: rs.cards) {
				if(x.getOverallVal()>=oov && x.getNumber()%2==0) {
					oov = x.getOverallVal();
				}
			}
			if(tov<oov) return -1;
			if(tov>oov) return 1;
			if(tov==oov) return 0;
			
			return -2;
		}
		
		return -2;		
	}
	private int compareYellow(Red7CardSet rs) {
		int t=0;
		int o=0;
		
		for(int i = 0;i<this.cards.size();i++){
			for(int ii=i+1;ii<this.cards.size();ii++) {
				if(this.cards.get(i).getColor().equals(this.cards.get(ii).getColor())){
					t++;
				}
			}
		}
		for(int i = 0;i<rs.cards.size();i++){
			for(int ii=i+1;ii<rs.cards.size();ii++) {
				if(rs.cards.get(i).getColor().equals(rs.cards.get(ii).getColor())){
					o++;
				}
			}
		}
		if(t<o) return -1;
		if(t>o) return 1;
		if(t==o) return compareRed(rs);
		
		return -2;
		
	}
	private int compareOrange(Red7CardSet rs) {
		int t=0;
		int o=0;
		
		for(int i = 0;i<this.cards.size();i++){
			for(int ii=i+1;ii<this.cards.size();ii++) {
				if(this.cards.get(i).getNumber() == this.cards.get(ii).getNumber()){
					t++;
				}
			}
		}
		for(int i = 0;i<rs.cards.size();i++){
			for(int ii=i+1;ii<rs.cards.size();ii++) {
				if(rs.cards.get(i).getNumber() == rs.cards.get(ii).getNumber()){
					o++;
				}
			}
		}
		if(t<o) return -1;
		if(t>o) return 1;
		if(t==o) return compareRed(rs);
		
		return -2;
	}
	private int compareRed(Red7CardSet rs) {
		int tov = 0;
		int oov = 0;
		
		for(Red7Card x: this.cards) {
			if(x.getOverallVal()>=tov) {
				tov = x.getOverallVal();
			}
		}
		for(Red7Card x: rs.cards) {
			if(x.getOverallVal()>=oov) {
				oov = x.getOverallVal();
			}
		}
		if(tov<oov) return -1;
		if(tov>oov) return 1;
		if(tov==oov) return 0;
		
		return -2;
	}
	
	public String toString() {
		String answer = "";
		
		for(Red7Card x: cards) {
			answer += x.toString() + ", ";
		}
		return answer;
	}

}//class
