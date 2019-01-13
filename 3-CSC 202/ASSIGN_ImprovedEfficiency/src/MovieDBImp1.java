/**
 * This is my description of my MovieDBImp1 Class. It improves runtime by using binary search and gettig rid of sorting the array.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/21/2017
 */
public class MovieDBImp1{
	private Movie[] entries;
	private int last;

	public MovieDBImp1(){
		entries = new Movie[72];
		last=-1;
	}

	public void add(Movie m){
	
		if(last==entries.length-1) growArr();
		last++;
		for(int i=0; i<last; i++){
			if(entries[i].compareTo(m)>0){
				Movie temp = entries[i];
				entries[i] = m;
				m = temp;
			}
		}
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
		int low = 0;
		int high = last;

		while(high >= low) {
			int middle = (low + high) / 2;
			if(entries[middle].equals(m)) {
				for(int j=middle; j < last; j++) entries[j]=entries[j+1];
				last--;
				break;
			}
			else if(entries[middle].compareTo(m) < 0) {
				low = middle + 1;
			}
			else if(entries[middle].compareTo(m) > 0) {
				high = middle - 1;
			}

		}

	}

	public Movie get(int ind){
		return entries[ind];
	}

	public boolean contains(Movie m){
		boolean flag = false;

		int low = 0;
		int high = last;

		while(high >= low) {
			int middle = (low + high) / 2;
			if(entries[middle].equals(m)) {
				flag = true;
				break;
			}
			else if(entries[middle].compareTo(m) < 0) {
				low = middle + 1;
			}
			else if(entries[middle].compareTo(m) > 0) {
				high = middle - 1;
			}
		}

		return flag;
	}

	public int size(){
		return last+1;
	}
}