package linkedlistreview;

public class Node { 
    private Node next;
    private Node previous;
    
    public Node(Node nextus, Node previousus) { next = nextus; previous = previousus; }
    
    public Node getNext() { return next; }
    
    public Node getPrevious() { return previous; }
    
    public void setNext(Node nextus) {
        next = nextus;
    }
    
    public void setPrevious(Node previousus) {
        previous = previousus;
    }
    
    public int compareTo() { return 1; }
}