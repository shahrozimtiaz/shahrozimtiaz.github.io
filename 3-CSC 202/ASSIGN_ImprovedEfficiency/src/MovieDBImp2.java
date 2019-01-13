/**
 * This is my description of my MovieDBImp1 Class. It improves runtime by getting rid of sorting and growing the array.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/21/2017
 */
public class MovieDBImp2{
	private Movie[] entries;
	private int last;

	public MovieDBImp2(){
		entries = new Movie[23655];
		last=-1;
	}

	public void add(Movie m){
		if(last==entries.length-1) growArr();
		last++;
		entries[last]=m;
	}

	private void growArr(){
		System.out.println("it grew");
		Movie[] newArr = new Movie[entries.length*2];
		for(int i=0; i<entries.length; i++)
			newArr[i]=entries[i];
		entries = newArr;
	}

	public void remove(Movie m){
		boolean removed = false;
		for(int i=0; i<=last; i++){
			if(!removed && m.equals(entries[i])){
				for(int j=i; j < last; j++) entries[j]=entries[j+1];
				last--;
				removed = true;
			}
		}
	}

	public Movie get(int ind){
		return entries[ind];
	}

	public boolean contains(Movie m){
		boolean flag = false;
		for(int i=0; i<=last; i++){
			if(m.equals(entries[i])) flag=true;
		}
		return flag;
	}

	public int size(){
		return last+1;
	}
}
