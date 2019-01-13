public class TestBST{
	public static void main(String[] args){
        testNonRecursive();
        testRecursive();
	}
    
    public static void testRecursive(){
        BST<String> sBST = new BST();
        
        String[] parts = "G L J D E T R B C F W A".split(" ");
        for(int i=0; i<parts.length; i++){
            sBST.addRecursive(parts[i]);
            System.out.println(sBST);
        }
        
        
        // REMOVE TESTS
        
        ///////////////////////
        
        System.out.println("\n\nTest Remove Leaf");
        sBST.removeRecursive("F");
        System.out.println(sBST);
        
        
        ///////////////////////
        
        
        BST<String> sBST2 = new BST();
        for(int i=0; i<parts.length; i++) sBST2.addRecursive(parts[i]);
        

        
        System.out.println("\n\nTest Remove Node with Single Child");
        sBST2.removeRecursive("E");
        System.out.println(sBST2);
        
        ///////////////////////
        
        BST<String> sBST3 = new BST();
        for(int i=0; i<parts.length; i++) sBST3.addRecursive(parts[i]);
        
        System.out.println("\n\nTest Remove Node with 2 Children (largest is leaf)");
        sBST3.removeRecursive("D");
        System.out.println(sBST3);//.getLevels());
        
        ///////////////////////
        
        BST<String> sBST4 = new BST();
        String[] parts2 = "G L J C E T R B D W A".split(" ");
        for(int i=0; i<parts2.length; i++) sBST4.addRecursive(parts2[i]);
        
        System.out.println("\n\nTest Remove Node with 2 Children (largest has child)");
        sBST4.removeRecursive("G");
        System.out.println(sBST4);
        
        System.out.println(sBST4.postorderTraversal());
      

     

    }
    
    public static void testNonRecursive(){
        BST<String> sBST = new BST();
        
        String[] parts = "G L J D E T R B C F W A".split(" ");
        for(int i=0; i<parts.length; i++){
            sBST.add(parts[i]);
            System.out.println(sBST);
        }
        
        
        // REMOVE TESTS
        
        ///////////////////////
        
        System.out.println("\n\nTest Remove Leaf");
        sBST.remove("F");
        System.out.println(sBST);
        
        
        ///////////////////////
        
        
        BST<String> sBST2 = new BST();
        for(int i=0; i<parts.length; i++) sBST2.add(parts[i]);
        
        System.out.println("\n\nTest Remove Node with Single Child");
        sBST2.remove("E");
        System.out.println(sBST2);
        
        ///////////////////////
        
        BST<String> sBST3 = new BST();
        for(int i=0; i<parts.length; i++) sBST3.add(parts[i]);
        
        System.out.println("\n\nTest Remove Node with 2 Children (largest is leaf)");
        sBST3.remove("D");
        System.out.println(sBST3);//.getLevels());
        
        ///////////////////////
        
        BST<String> sBST4 = new BST();
        String[] parts2 = "G L J C E T R B D W A".split(" ");
        for(int i=0; i<parts2.length; i++) sBST4.add(parts2[i]);
        
        System.out.println("\n\nTest Remove Node with 2 Children (largest has child)");
        sBST4.remove("G");
        System.out.println(sBST4);
    }
}
