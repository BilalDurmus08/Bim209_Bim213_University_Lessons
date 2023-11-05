package DoublyLinkedList;

public class Node {
    private int value;
    Node next;
    Node prev;

    public Node (int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean hasNext(Node localNode){ //This method wasn't wanted. I added this method to my class. It might be useful.
        if (localNode.next == null){
            return false;
        }else {
            return true;
        }
    }



}
