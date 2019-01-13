public class BSTNode<T>{
	private BSTNode<T> parent, left, right;
	private T datum;

	public BSTNode(T d){
		parent = left= right = null;
		datum = d;
	}

	//Helper Function
	public boolean isRoot(){
		return parent==null;
	}
	public boolean hasBothChildren(){
		return left!=null && right!=null;
	}
	public boolean isLeaf(){
		return left==null && right==null;
	}
	public boolean isRight(BSTNode<T> node){
		return node==right;
	}
	public boolean isLeft(BSTNode<T> node){
		return node==left;
	}
    public boolean hasLeft(){
        return left!=null;
    }
    public boolean hasRight(){
        return right!=null;
    }
    
	//Mutators
	public void setParent(BSTNode<T> p){parent=p;}
	public void setLeft(BSTNode<T> l){left=l;}
	public void setRight(BSTNode<T> r){right=r;}


	//Accessors
	public T getData(){return datum;}
	public BSTNode<T> getParent(){return parent;}
	public BSTNode<T> getLeft(){return left;}
	public BSTNode<T> getRight(){return right;}

	//public int compareTo(BSTNode<T> node){
		//return datum.compareTo(node.getData());
	//}
    public String toString(){
        return datum.toString();
    }
}