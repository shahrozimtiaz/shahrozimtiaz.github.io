public class ArrayHeap<T> {
	private boolean minHeap;
	private Object[] heapArr;
	private int lastSpot;
	
	public ArrayHeap(){this(100);}
	public ArrayHeap(boolean isMin){this(100,isMin);}
	public ArrayHeap(int startingSz){
		heapArr=new Object[startingSz];
		minHeap=true;
		lastSpot=0;
	}
	public ArrayHeap(int startingSz, boolean isMin){
		heapArr=new Object[startingSz];
		minHeap=isMin;
		lastSpot=0;
	}
	
	public void enqueue(T data, double priority){
		if(lastSpot==heapArr.length){//GROWWW
			Object[] obj=new Object[heapArr.length*2];
			for(int i=0; i<heapArr.length;i++) obj[i] = heapArr[i];
			heapArr=obj;
		}
		HeapNode<T> nNode = new HeapNode(data, priority);
		heapArr[lastSpot++]=nNode;
		int curr = lastSpot-1;
		//DO I need to bubble up curr?
		if(curr==0) return;
		int parenInd = (curr-1)/2;
		boolean parenCheck = ((HeapNode<T>)heapArr[parenInd]).getP()<((HeapNode<T>)heapArr[curr]).getP(); // for minHeap
		if(!minHeap) parenCheck=!parenCheck;
		
		while(curr!=0 && !parenCheck){ //need to swap
			Object temp=heapArr[parenInd];
			heapArr[parenInd]=heapArr[curr];
			heapArr[curr]=temp;
		
			curr=parenInd;
			if(curr!=0) parenInd = (curr-1)/2;
			parenCheck = ((HeapNode<T>)heapArr[parenInd]).getP()<((HeapNode<T>)heapArr[curr]).getP();
			if(!minHeap) parenCheck=!parenCheck;
		}
	}
	
	public T dequeue(){
		if(lastSpot==0) return null;
		T toRet = ((HeapNode<T>)heapArr[0]).getD();
		
		heapArr[0]=heapArr[--lastSpot];
		int curr = 0;
		//DO I need to bubble down curr?		
		
		int childInd = 2*curr+1;
		boolean childCheck=false; // checks if order property hold (true=yes to property, false need to swap)
		while(childInd<lastSpot && !childCheck){
			if(2*curr+2<lastSpot){
				boolean compCheck = ((HeapNode<T>)heapArr[childInd]).getP()<((HeapNode<T>)heapArr[2*curr+2]).getP();
				if(!minHeap) compCheck=!compCheck;
				if(!compCheck) childInd++;
			}	

			//Do I need to swap with child?
			childCheck = true; //meets heap specs
			if(childInd<lastSpot){
					childCheck = ((HeapNode<T>)heapArr[curr]).getP()<((HeapNode<T>)heapArr[childInd]).getP();
					if(!minHeap) childCheck=!childCheck;
			}
			
			if(!childCheck){ //swap
				Object temp=heapArr[childInd];
				heapArr[childInd]=heapArr[curr];
				heapArr[curr]=temp;
			
				curr = childInd;
				childInd = 2*curr+1;
			}
		}
		return toRet;
	}
	
	public int getSize(){return lastSpot;}
	
	public String toString(){
		String s="";
		for(int i=0; i<lastSpot; i++)
			s+=heapArr[i]+"\n";
		return s;
	}
	
	
	
	class HeapNode<T>{
		double priority;
		T data;
		public HeapNode(T datum, double priority){
			this.priority=priority;
			data=datum;
		}
		
		public double getP(){return priority;}
		public T getD(){return data;}
		public String toString(){
			return "("+priority+") "+data;
		}
	}
	
	public static void main(String[] args){
		ArrayHeap<String> ar = new ArrayHeap(1,true);
		ar.enqueue("Hi",5);
		ar.enqueue("Good",6);
		ar.enqueue("test",3);
		ar.enqueue("this",1);
		ar.enqueue("What",5);
		ar.enqueue("Hello",7);
		ar.enqueue("Bye",0);
		ar.enqueue("YAY",2);
		System.out.println("--"+ar.dequeue()+"--");
		System.out.println("--"+ar.dequeue()+"--");
		System.out.println("--"+ar.dequeue()+"--");
		System.out.println("--"+ar.dequeue()+"--");

		System.out.println(ar);
	}


}