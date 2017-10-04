package linkedlistreview;

public class LinkedListReview { 
    public static void main(String[] args) { 
       LinkedList a = new LinkedList();
       a.addFirst("Reeeee");
       a.addFirst("Pepe");
       System.out.println(a.getFirst().getValue());
       System.out.println(a);
       a.addLast("Hi there");
       System.out.println(a);
       a.sort();
       System.out.println(a);
    } 
}