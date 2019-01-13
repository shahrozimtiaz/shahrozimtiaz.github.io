/**
 * This is my description of my HuffCodes Class. It encodes and decodes which requires 3 methods.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 11/12/2017
 */
public class HuffCodes implements HuffEncodable {

	
	ArrayHeap<TreeNode<String>> letterNodes;

	private TreeNode<String> root = null;
	private TreeNode<String> curr = null;
	private TreeNode<String> ln = null;
	private TreeNode<String> rn = null;



	double count;
	String tempLetter;
	boolean alreadyCounted;

	@Override
	public void constructEncoding(String forCounts) {
	
		
		letterNodes = new ArrayHeap(1,true);

		getFrequency(forCounts);

		while(letterNodes.getSize()>1) {
 
			ln = letterNodes.dequeue(); //leftnode	

			rn = letterNodes.dequeue(); //rightnode

			curr = new TreeNode(ln.getData()+rn.getData(), ln.getFreq()+rn.getFreq()); //combined
			
			curr.setLeft(ln);
			curr.setRight(rn);
			
			letterNodes.enqueue(curr, curr.getFreq());

		
		}
		
		
		root = curr;
	}	
	
	//@Override
	public String encode(String text) {
		String answerEncode = "";
		
		 TreeNode<String> traveller = root;
		
		for(int i = 0;i<text.length();i++) {
			if(text.charAt(i) == '0') {
				traveller=traveller.getLeft();
			}
			else if (text.charAt(i) == '1') {
				traveller=traveller.getRight();
				
			}
			if(traveller.isLeaf()) {
				answerEncode += traveller.getData();
				traveller = root;
			}
		}
		
		return answerEncode;

		//TODO: Using the generated encoding/tree convert the binary sequence to ASCII
	}
	@Override
	public String decode(String binary) {
		String answer = "";
		for(int i = 0;i<binary.length();i++) {
			String templl = binary.charAt(i)+"";
			answer += templl + ":";
		if(root==null) { return answer;}

		 TreeNode<String> parent = root;
		 
		 TreeNode<String> current = root.getLeft();
		 

		if(current==null) {
			current=root.getRight();
			answer+=1;
		}
		else{answer+="0";}
		 current.setParent(parent);

		while(current!=root){
			//move current and visit
			if(current.getData().equals(templl)){

				break;
			}	
			if(current!=null && current.getLeft()!=null){

				parent = current;
				current = current.getLeft();
				current.setParent(parent);
				answer += "0";
				

			} else if(current!=null && current.getRight()!=null){

				parent = current;
				current = current.getRight();
				current.setParent(parent);
				answer += "1";
			
			} else { //backtracking....
				while(parent!=null && parent.isRight(current)){
					//if(current!=null) {answer += " " + current;}
					if(answer.length()>0) {
					answer = answer.substring(0,answer.length()-1);
					}
					current = parent;
					parent = current.getParent();
					
				}
				if(parent!=null && parent.isLeft(current)) {
					//if(current!=null) {answer += " " + current;}
					if(answer.length()>0) {
					answer = answer.substring(0,answer.length()-1);
					}
					answer += "1";
					current = parent.getRight();

				}
			}

		}//end while
		
		answer += ", ";
	}
		return answer;
	}	//TODO: Must override toString, Generate a nice string to show all characters and their encoding (A:101001,B:1101,...) or so
	

	private void getFrequency(String forCounts) {
		for(int i=0;i<forCounts.length();i++) {   ////gets frequency of letters
			tempLetter = forCounts.charAt(i) + "";
			count = 1;
			alreadyCounted = false;
			for(int ai=0;ai<i;ai++) {		
				if( tempLetter.equalsIgnoreCase(forCounts.charAt(ai) + "")) {
					alreadyCounted=true;
					break;
				}
			}
			if(!alreadyCounted) {
				for(int ii=i+1;ii<forCounts.length();ii++) {
					if( tempLetter.equalsIgnoreCase(forCounts.charAt(ii) + "")) {
						count++;
					}
				}
				TreeNode<String> templ = new TreeNode(tempLetter, count);
				
				letterNodes.enqueue(templ, count);
				//letters.enqueue(tempLetter, count);
			}
		}      ////gets frequency of letters
		
	}
	public static void main(String[] args){
		HuffEncodable ar = new HuffCodes(); 
		ar.constructEncoding("A_DEAD_DAD_CEDED_A_BAD_BABE_A_BEADED_ABACA_BED");
		System.out.println(ar.encode("100001110"));

		System.out.println(ar.decode("BCE"));
	}
}
