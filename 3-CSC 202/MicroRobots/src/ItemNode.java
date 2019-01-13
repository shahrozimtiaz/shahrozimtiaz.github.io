/**
 * This is my description of my ItemNode class. This is where kept track of the paths. 
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 12/10/2017
 */
public class ItemNode<T>{
	private T datum;
	private ItemNode<T> parent;

	public ItemNode(T d){
		datum = d;
	}
	public void setParent(ItemNode<T> p){parent=p;}

	public ItemNode<T>  getParent(){return parent;}

	public T getData(){return datum;}

}