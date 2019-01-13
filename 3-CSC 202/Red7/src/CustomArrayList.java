/**
 * This is my description of my CustomArrayList class. It is a custom arraylist that I created.
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/21/2017
 */
public class CustomArrayList<T extends R7Comparable>{

	private int size;
	private int last;
	private int maxSize;
	
	private Object[] customArrayList;

	public CustomArrayList(){

		maxSize = 50;
		this.customArrayList = new Object[maxSize];
		size=0;
		last=-1;
	}     
	public int size() {
		return size;
	}

	public void add(T t) {
		if(size==customArrayList.length) growArr();
		size++;
		
		for(int i=0; i<size; i++){
			if(customArrayList[i] == null) {
				customArrayList[++last]=t;
				return;
			}
			T curr = (T) customArrayList[i];
			if(curr.compareTo(t)>0){
				T temp = (T) customArrayList[i];
				customArrayList[i] = t;
				t = temp;
			}
		}


		customArrayList[++last]=t;

	}
	private void growArr(){
		Object[] newArr = new Object[customArrayList.length*2];
		for(int i=0; i<customArrayList.length; i++)
			newArr[i]=customArrayList[i];
		customArrayList = newArr;
	}

	public T get(int index) {

		if (index >= size){

			throw new ArrayIndexOutOfBoundsException("array index out of bound exception with index at"+index);

		}
		return (T)customArrayList[index];

	}
	public void remove(T t) {

		for(int i=0; i<this.size(); i++){
			if( t.equals(customArrayList[i])){
				for(int j=i; j < this.size-1; j++) customArrayList[j]=customArrayList[j+1];
			}
		}
		customArrayList[size-1]=null;
		size--;
		last--;
	}
}


     
