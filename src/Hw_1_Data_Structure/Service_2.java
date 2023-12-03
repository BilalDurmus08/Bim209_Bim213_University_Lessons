package Hw_1_Data_Structure;

//Queue with Linked List
public class Service_2 {
    Service_1 queue; // Your queue. Use this

    // Constructor to initialize a queue
    Service_2() {
        this.queue = new Service_1();
    }

    // Utility function to dequeue the front element
    public Patient dequeue() {
        //Write your codes here
        if (queue.isEmpty()) {
            return null;
        } else {
            Patient temp = queue.head;
            queue.head = queue.head.next;
            queue.head.next.previous = null;
            return temp;
        }
        // don't forget to delete this line
    }

    // Utility function to add an item to the queue
    public void enqueue(Patient p) {
        //Write your codes here
        if (queue.head == null) {
            queue.head = queue.tail = p;
        } else {
            queue.tail.next = p;
            p.previous = queue.tail;
            queue.tail = p;
            p.next = null;
        }
    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty() {
        //Write your codes here
        return queue.head == null;
        // don't forget to delete this line
    }

    // Utility function to return the size of the queue
    public int size() {
        int i = 1;
        Patient p = queue.head;
        while (p.next != null) {
            p = p.next;
            i++;
        }
        return i;
        //Write your codes here
        // don't forget to delete this line
    }

}
