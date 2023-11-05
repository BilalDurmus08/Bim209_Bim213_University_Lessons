package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList myLinkedList = new CustomLinkedList(152);
        myLinkedList.insert(10);
        myLinkedList.insert(12);
        myLinkedList.insert(13);
        myLinkedList.insert(1400);
        myLinkedList.insert(25, 0);
        myLinkedList.deleteByName(1400);
        myLinkedList.print();
        myLinkedList.deleteByIndex(4);
        myLinkedList.print();
        System.out.println(myLinkedList.isContainValue(28));
    }

}
