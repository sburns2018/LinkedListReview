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
    
    public void addLast(String val) { 
        getLast().setNext(new Node(val, null, getLast()));
    }
    
    public Node getLast() { 
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }
    
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
    
    public void insertAt(int index, String value) { 
        if(index == 0) {
            addFirst(value);
        } else if (getAt(index) == null) {
            addLast(value);
        } else {
            Node temp = new Node(value, getAt(index).getPrevious(), getAt(index));
            if (temp.getNext() != null) {temp.getNext().setPrevious(temp); }
            if (temp.getPrevious() != null) { temp.getPrevious().setNext(temp); }
        } 
    }
    
    public void insertAfter(int index, String value) { 
        Node temp = head;
        boolean endOfList = false;
        while(!endOfList) { 
            if(temp.getValue().equals(value)) { 
                if(temp.getNext() != null) { temp.setNext(new Node(value, temp, temp.getNext())); } else { temp.setNext(new Node(value, temp, null)); }
                endOfList = true;
            } else {  
                if (temp.getNext() == null) {  
                    temp.setNext(new Node(value, temp, null)); 
                    endOfList = true;
                }  else {  
                    temp = temp.getNext(); 
                }  
            }
        }
    }
    
    public void insertBefore() { }
    
    public void remove(int index) { 
        Node temp = getAt(index);
        if (temp != null) {
            if (temp.getPrevious() == null && temp.getNext() == null) {
                head = null;
            }
            if (temp.getPrevious() != null) {
                temp.getPrevious().setNext(temp.getNext());
            }
            if (temp.getNext() != null) {
                temp.getNext().setPrevious(temp.getPrevious());
            }
        }
    }
    
    public void swap() { }
    
    public void sort() { }
}