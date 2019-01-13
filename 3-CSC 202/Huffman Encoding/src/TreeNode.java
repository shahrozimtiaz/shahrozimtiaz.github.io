/**
 * This is my description of my TreeNode Class. It stores normal treeNode relations as well as frequency.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 11/12/2017
 */
public class TreeNode<T extends Comparable<T>> implements Comparable<TreeNode<T>>{
	private TreeNode<T> parent, left, right;
	private T datum;
	private double freq;

	public TreeNode(T d, double freq){
		parent = left= right = null;
		datum = d;
		this.freq=freq;
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
	public boolean isRight(TreeNode<T> node){
		return node==right;
	}
	public boolean isLeft(TreeNode<T> node){
		return node==left;
	}
    public boolean hasLeft(){
        return left!=null;
    }
    public boolean hasRight(){
        return right!=null;
    }
    
	//Mutators
	public void setParent(TreeNode<T> p){parent=p;}
	public void setLeft(TreeNode<T> l){left=l;}
	public void setRight(TreeNode<T> r){right=r;}


	//Accessors
	public T getData(){return datum;}
	public double getFreq(){return freq;}
	public TreeNode<T> getParent(){return parent;}
	public TreeNode<T> getLeft(){return left;}
	public TreeNode<T> getRight(){return right;}

	public int compareTo(TreeNode<T> node){
		if(this.getFreq()>node.getFreq()) {
			return 1;
		}
		if(this.getFreq()<=node.getFreq()) {
			return -1;
		}
		else return 0;
	}
    public String toString(){
        return datum.toString();
    }
}