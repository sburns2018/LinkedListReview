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
    
    public String toString() { return "a"; }
    
    public boolean contains() { return false; }
    
    public void insertAt() { }
    
    public void insertAfter() { }
    
    public void insertBefore() { }
    
    public void remove() { }
    
    public void swap() { }
    
    public void sort() { }
}