//Shahoz Imtiaz

import static org.junit.Assert.*;

public class LRULinkedList {
    public Node head;
    public Node tail;
    public int capacity =0;
    public int size =0;

    /**
     * Constructor creates a double linked list with a single value.
     */
    public LRULinkedList(int capacity){
        this.capacity = capacity;
    }

    /**
     * Add a node to the linked list.
     * @param key
     * @param value
     * @return new node
     */
    public Node add(int key, int value) {
        // TODO: implement this method
        Node toAdd = new Node(key, value);
        if(size < capacity){
            moveNodeToHead(toAdd);
            size++;
        }
        else{
            deleteTail();
            tail.next=toAdd;
            toAdd.previous=tail;
            tail=toAdd;
        }
        return toAdd;
    }

    /**
     * Remove the last item in the linked list.
     */
    public void deleteTail(){
        // TODO: implement this method
        tail=tail.previous;
        tail.next=null;
    }

    /**
     * Get the value of the current node.
     * @param key
     * @return value at key
     */
    public Node getValue(int key){
        // TODO: implement this method
        Node itr=head;
        while(itr!=null){
            if(itr.key==key){
                return itr;
            }
            itr=itr.next;
        }
        System.out.println("Key not Found");
    }

    /**
     * Move the passed in node to the head position.
     * @param node
     */
    public void moveNodeToHead(Node node){
        // TODO: implement this method
        head.previous=node;
        node.next=head;
        head=node;
    }

    public static void main(String[] args) {
        LRULinkedList lruLinkedList1 = new LRULinkedList(1);
        lruLinkedList1.add(1, 2);
        assertEquals(lruLinkedList1.getValue(1).value, 2);
        lruLinkedList1.add(2, 3);
        assertEquals(lruLinkedList1.getValue(1), null);
    }

}