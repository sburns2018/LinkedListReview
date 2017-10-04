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
    
    public void addLast() { 
        
    }
    
    public Node getLast() { return head; }
    
    public Node get(String value) { 
        Node temp = head;
        for(int i = 0; temp != null; i++) { if (temp.getValue().equals(value)) { return temp; } else { temp = temp.getNext(); } }
        return null;
    }
    
    public Node getAt(int index) { 
        Node temp = head;
        for(int i = 0; i != index; i++) { temp = temp.getNext(); }
        return temp;
    }
    
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
             temp = temp.getNext();
         }
         return res;
    }
    
    public boolean contains(String targ) {
        Node temp = head;
        while (temp != null) {
            if (temp.getValue().equals(targ)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
    
    public void insertAt() { }
    
    public void insertAfter() { }
    
    public void insertBefore() { }
    
    public void remove() { }
    
    public void swap() { }
    
    public void sort() { }
}