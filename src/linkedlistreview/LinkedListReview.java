package linkedlistreview;

public class LinkedListReview { 
    public static void main(String[] args) { 
       LinkedList a = new LinkedList();
       a.addFirst("Reeeee");
       a.addFirst("Pepe");
       System.out.println(a.getFirst().getValue());
       System.out.println(a);
    } 
}