public class ItemNode<T>{
   private T datum;
   private ItemNode<T> parent;
   private ItemNode<T> next;
   
   public ItemNode(T d){
      datum = d;
      next=null;
   }
   
   public void setNext(ItemNode<T> in){
      next = in;
   }
	public void setParent(ItemNode<T> p){parent=p;}
	public boolean isRoot(){
		return parent==null;
	}
   public ItemNode<T> getNext(){return next;}
   public ItemNode<T>  getParent(){return parent;}

   public T getData(){return datum;}
  
}