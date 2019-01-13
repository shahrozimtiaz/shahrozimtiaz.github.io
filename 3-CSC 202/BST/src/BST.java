/**
 * This is my description of my BST Class. It shows me going through/manipulating a BST.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 11/5/2017
 */
public class BST<T extends Comparable<T>> {
	private BSTNode<T> root;
	private int size;

	public BST(){
		size = 0;
		root = null;
	}
	public boolean contains(T data){ //good

		if(root==null) return false;
		BSTNode<T> current = root;

		//First try to find the node...
		int comparisonValue = data.compareTo(current.getData());
		while(current!=null){
			if(comparisonValue==0){
				return true;
			} 
			else if(comparisonValue<0){
				current = current.getLeft();
			} 
			else if(comparisonValue>0) {
				current = current.getRight();
			}
			if(current!=null) comparisonValue = data.compareTo(current.getData());
		}

		return false; //couldn't find it
	}
	public BSTNode<T> getMaxNode(){ //good

		if(root==null) return null;

		BSTNode<T> current = root;

		while(current.hasRight()){
			current = current.getRight();
		}

		return current;
	}
	public int getLevelsRec(BSTNode<T> root,int levels, int clevels){  // Initial values for levels and clevels must be 1
		
		if(root==null) {levels=0; return levels;}

		if(root.hasLeft()) {
			clevels++;
			levels = getLevelsRec(root.getLeft(),levels, clevels);
			clevels--;
		}

		if(root.hasRight()) {
			clevels++;
			levels = getLevelsRec(root.getRight(),levels, clevels);
			clevels--;
		}

		if(clevels > levels) { levels = clevels; }
		clevels=clevels-1;

		return levels;


	}
	public String preorderTraversal(BSTNode<T> root){ 
		String answer = "";

		if(root==null) {answer = "empty"; return answer;}

		answer = root.toString();

		if(root.hasLeft()) {
			answer += " " + preorderTraversal(root.getLeft());
		}

		if(root.hasRight()) {

			answer += " " + preorderTraversal(root.getRight());
		}
		return answer;


	}
	public String inorderTraversal(BSTNode<T> root){ 
		String answer = "";

		if(root==null) {answer = "empty"; return answer;}


		if(root.hasLeft()) {
			answer += inorderTraversal(root.getLeft());
		}

		if(root.hasRight()) {
			answer += " " + root;
			return answer += inorderTraversal(root.getRight());
		}

		return answer += " " + root;


	}
	public String postorderTraversal(){ 
		String answer = "";

		if(root==null) return answer;

		BSTNode<T> parent = root;
		BSTNode<T> current = root.getLeft();

		if(current==null) current=root.getRight();
		//if(current!=null) {answer += current;}

		while(current!=root){
			//move current and visit
			if(current!=null && current.getLeft()!=null){

				parent = current;
				current = current.getLeft();
				

			} else if(current!=null && current.getRight()!=null){

				parent = current;
				current = current.getRight();
			
			} else { //backtracking....
				while(parent!=null && parent.isRight(current)){
					if(current!=null) {answer += " " + current;}
					current = parent;
					parent = current.getParent();
					
				}
				if(parent!=null && parent.isLeft(current)) {
					if(current!=null) {answer += " " + current;}
					current = parent.getRight();

				}
			}

		}//end while
		return answer += " " +  root;


	}





	////////////////////////////////////////////////////////MY CODE IS ABOVE THIS LINE//////////////////////////////////////////////
	/******************************************************************************
	 * Iterative Add
	 ******************************************************************************/
	public void add(T data){
		size++; 
		BSTNode<T> newNode = new BSTNode(data);
		if(root==null){
			root=newNode;
			return;
		}
		BSTNode<T> current = root;

		boolean isAdded = false;
		while(!isAdded){
			BSTNode<T> left = current.getLeft();
			BSTNode<T> right = current.getRight();

			if(newNode.compareTo(current)<0){
				//Go Left
				if(left == null){ //this is the place to add
					current.setLeft(newNode);
					newNode.setParent(current);
					isAdded = true;
				} else
					current = left;
			} else {
				//Go Right
				if(right == null){ //this is the place to add
					current.setRight(newNode);
					newNode.setParent(current);
					isAdded = true;
				} else
					current = right;
			}
		} //end while not added yet
	}

	/******************************************************************************
	 * Recursive Add
	 ******************************************************************************/
	public void addRecursive(T data){
		size++;
		BSTNode<T> nNode = new BSTNode(data);
		boolean addHere = addRec(nNode,root);
		if(addHere) root = nNode;
	}

	public boolean addRec(BSTNode<T> newNode, BSTNode<T> stRoot){
		if(stRoot==null) return true;
		if(newNode.compareTo(stRoot)<0){   //Go Left
			boolean addHere = addRec(newNode,stRoot.getLeft());
			if(addHere){
				stRoot.setLeft(newNode);
				newNode.setParent(stRoot);
			}
		} else {                            //Go Right
			boolean addHere = addRec(newNode,stRoot.getRight());
			if(addHere){
				stRoot.setRight(newNode);
				newNode.setParent(stRoot);
			}
		}
		return false;
	}


	/******************************************************************************
	 * Iterative Remove
	 ******************************************************************************/
	public void remove(T data){

		if(root==null) return;
		BSTNode<T> current = root;

		//First try to find the node...
		int comparisonValue = data.compareTo(current.getData());
		while(current!=null && comparisonValue!=0){
			if(comparisonValue<0){
				current = current.getLeft();
			} else {
				current = current.getRight();
			}
			if(current!=null) comparisonValue = data.compareTo(current.getData());
		}

		if(current==null) return; //couldn't find it

		//FOUND IT Time to remove it 3 cases:

		if(current.isLeaf()){
			BSTNode<T> parent = current.getParent();
			if(parent==null) root = null;
			else if(parent.getLeft() == current) parent.setLeft(null);             // == here works because I am checking that they are the same objects on heap...i.e. they reference the same thing.
			else parent.setRight(null);

		} else if(current.hasBothChildren()){
			//TWO Branches...first need to get max of left branch
			BSTNode<T> maxSTNode = getMaxNodeRec(current.getLeft());

			//move maxSTNode into place of current (which is to be removed)...so remove maxSTNode from it's current location
			if(maxSTNode.isLeaf()){
				//We know it is the right child since it is the max
				maxSTNode.getParent().setRight(null);
			} else {
				//need to skip over this node...we know where stuff is because of the max property
				maxSTNode.getParent().setRight(maxSTNode.getLeft());
			}

			//maxSTNode has been removed and can now be swapped into the current node (or one to remove)
			current.getRight().setParent(maxSTNode);
			current.getLeft().setParent(maxSTNode);
			maxSTNode.setRight(current.getRight());
			maxSTNode.setLeft(current.getLeft());
			maxSTNode.setParent(current.getParent());
			if(current.isRoot()) root = maxSTNode;
			else if(current.getParent().isLeft(current)) current.getParent().setLeft(maxSTNode);
			else current.getParent().setRight(maxSTNode);

		} else if(current.hasLeft()){
			BSTNode<T> left = current.getLeft();
			BSTNode<T> parent = current.getParent();
			left.setParent(parent);
			if(!current.isRoot())
				parent.setLeft(left);
			else root = left;
		} else { //has right only
			BSTNode<T> right = current.getRight();
			BSTNode<T> parent = current.getParent();
			right.setParent(parent);
			if(!current.isRoot())
				parent.setRight(right);
			else root = right;
		}
		size--;
	}

	/******************************************************************************
	 * Recursive Remove
	 ******************************************************************************/
	public void removeRecursive(T data){
		boolean removedHere = removeRecursive(data,root);
		if(removedHere) {
			resolveRemove(root);
			size--;
		}
	}

	public boolean removeRecursive(T data, BSTNode<T> stRoot){
		if(stRoot==null) return false; //not found!
		if(data.compareTo(stRoot.getData())<0){   //Go Left
			boolean removedHere = removeRecursive(data,stRoot.getLeft());
			if(removedHere){
				resolveRemove(stRoot.getLeft());
				size--;
			}
		} else if(data.compareTo(stRoot.getData())>0){  //Go Right
			boolean removedHere = removeRecursive(data,stRoot.getRight());
			if(removedHere){
				resolveRemove(stRoot.getRight());
				size--;
			}
		} else { //found it remove...
			return true;
		}
		return false;
	}

	public void resolveRemove(BSTNode<T> node){
		if(node==null) return;

		BSTNode<T> nodeToMoveIn = getMaxNodeRec(node.getLeft());
		if(nodeToMoveIn==null) nodeToMoveIn = node.getRight();

		//remove it from it's current location
		resolveRemove(nodeToMoveIn);

		//update it to be in the node's position
		if(node.getRight()!=null) node.getRight().setParent(nodeToMoveIn);
		if(node.getLeft()!=null) node.getLeft().setParent(nodeToMoveIn);
		if(nodeToMoveIn!=null){
			nodeToMoveIn.setParent(node.getParent());
			nodeToMoveIn.setRight(node.getRight());
			nodeToMoveIn.setLeft(node.getLeft());
		}
		if(node.isRoot()) root = nodeToMoveIn;
		else if(node.getParent().getLeft() == node) node.getParent().setLeft(nodeToMoveIn);             // == here works because I am checking that they are the same objects on heap...i.e. they reference the same thing.
		else node.getParent().setRight(nodeToMoveIn);
	}


	/******************************************************************************
	 * Helper Functions
	 ******************************************************************************/
	//Recursive Solution to getting Max Node in a subtree
	public BSTNode<T> getMaxNodeRec(BSTNode<T> current){
		if(current==null) return null;
		if(current.getRight()==null) return current;
		return getMaxNodeRec(current.getRight());
	}

	//Iterative Solution to getting the number of levels
	public int getLevels(){
		int levels = 0;
		int clevel = 0;
		if(root==null) return levels;
		BSTNode<T> parent = root;
		BSTNode<T> current = root.getLeft();
		if(current==null) current=root.getRight();
		if(current!=null) {clevel++; levels++;}

		while(current!=root){
			//move current and visit
			if(current!=null && current.getLeft()!=null){
				parent = current;
				current = current.getLeft();
				clevel++;
			} else if(current!=null && current.getRight()!=null){
				parent = current;
				current = current.getRight();
				clevel++;
			} else { //backtracking....
				while(parent!=null && parent.isRight(current)){
					current = parent;
					parent = current.getParent();
					clevel--;
				}
				if(parent!=null && parent.isLeft(current)) {
					current = parent.getRight();
				}
			}
			if(clevel>levels)levels=clevel;
		}//end whle
		return levels+1;
	}

	public String toString(){
		String s = "";
		int n = getLevels();
		int nodeCount = (int)Math.pow(2,n+1);
		Object[] nodeArray = new Object[nodeCount];
		nodeArray[0] = root;
		int spotAdd = 1;
		int nextPow = 1;
		int lastPow = nodeCount;
		int numNodes = nodeCount-(int)(int)Math.pow(2,n)-1;
		for(int i =0;i<numNodes; i++){
			if(i == nextPow-1){
				System.out.println();
				for(int sp=0; sp<lastPow/4-1;sp++)
					System.out.print(" ");
				nextPow*=2;
				lastPow/=2;
			} else
				for(int k=0; k<lastPow-1; k++)System.out.print(" ");
			if(nodeArray[i]!=null){
				System.out.print(((BSTNode<T>)(nodeArray[i])).getData());
				nodeArray[spotAdd++] = ((BSTNode<T>)(nodeArray[i])).getLeft();
				nodeArray[spotAdd++] = ((BSTNode<T>)(nodeArray[i])).getRight();
			} else {
				System.out.print("_");
				nodeArray[spotAdd++] = null;
				nodeArray[spotAdd++] = null;
			}

		}
		return "";
	}
	public Object getRoot() {
		return root;
	}


}