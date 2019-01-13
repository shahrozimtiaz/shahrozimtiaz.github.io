/**
 * This is my description of my LinkStack<T> Class. It has 2 methods.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 09/17/2017
 */
public class LinkStack<T>{

	ItemNode<T> top;

	public LinkStack(){
		top = null;
	}

	public T pop(){

		if(top==null){
			throw new RuntimeException("Nothing in here");
		}

		T temp = top.getData();
		top = top.getNext();	
		return temp;
		
	}

	public void push(T datum){

		ItemNode<T> oldTop = top;
		ItemNode<T> newTop = new ItemNode(datum);
		newTop.setNext(oldTop);
		top = newTop;	
		
	}


}//class