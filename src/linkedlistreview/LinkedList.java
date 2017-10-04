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
    
    @Override
    public String toString() { 
         String res = "{ ";
         Node temp = head;
         while (temp != null) {
             if (temp.getNext() == null) {
                 res += temp.getValue() + " }";
             } else {
                 res += temp.getValue() + ", ";
             }
         }
         return res;
    }
    
    public boolean contains() { return false; }
    
    public void insertAt() { }
    
    public void insertAfter() { }
    
    public void insertBefore() { }
    
    public void remove() { }
    
    public void swap() { }
    
    public void sort() { }
}