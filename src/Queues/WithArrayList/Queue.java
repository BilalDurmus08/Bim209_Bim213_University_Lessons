package Queues.WithArrayList;

public class Queue {
    private QueueNode front;
    private QueueNode rear;

    public Queue(){
    front = rear = null;
    }
    public boolean isEmpty(){
    return front == null;
    }
    public void Enqueue(int item){
    QueueNode node = new QueueNode(item);
    if (front == null){
        front = rear = node;
    }else {
        rear.next = node;
        rear = node;
    }
    }
    public int Dequeue(){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        QueueNode temp = front;
        front = front.next;
        if (front == null){
            rear = null;
        }
        return temp.item;
    }
}
