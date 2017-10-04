package linkedlistreview;

public class LinkedList { 
    private Node head;
        
    public LinkedList() { }
        
    public void addFirst(String value) { 
        if (head == null) { 
            head = new Node(value, null, null);
        } else {
            Node temp = head;
            head = new Node(value, temp, null);
            temp.setPrevious(head);
        }
    }
    
    public Node getFirst() { return head; }
    
    public void addLast() { }
    
    public Node getLast() { return head; }
    
    public Node get() { return head; }
    
    public Node getAt() { return head; }
    
    public String toString() { return "a"; }
    
    public boolean contains() { return false; }
    
    public void insertAt() { }
    
    public void insertAfter() { }
    
    public void insertBefore() { }
    
    public void remove() { }
    
    public void swap() { }
    
    public void sort() { }
}