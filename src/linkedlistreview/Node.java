package linkedlistreview;

public class Node { 
    private Node next;
    private Node previous;
    private String value;
    
    public Node(String valueus, Node nextus, Node previousus) { next = nextus; previous = previousus; value = valueus; }
    
    public String getValue() { return value; }
    
    public Node getNext() { return next; }
    
    public Node getPrevious() { return previous; }
    
    public void setValue(String val) {
        value = val;
    }
    
    public void setNext(Node nextus) {
        next = nextus;
    }
    
    public void setPrevious(Node previousus) {
        previous = previousus;
    }
    
    public int compareTo() { return 1; }
}