package Queues.WithArray;

public class Queue {
    private static int N = 100;
    int Q[];
    int front;
    int rear;
    int noItems;

    public Queue() {
        Q = new int[N];
        front = noItems = rear = 0;
    }

    public boolean isEmpty() {
        return noItems == 0;
    }

    public boolean isFull() {
        return noItems == N;
    }

    public int Enqueue(int item) {
        if (isFull()) {
            System.out.println("The Array is full");
            return -1;
        }
        Q[rear] = item;
        rear++;
        if (rear == N) {
            rear = 0;
        }
        noItems++;
        return 0;

    }

    public int Dequeue() {
        int idx = -1;
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        idx = front;
        front++; if (front == N) front = 0;
        noItems--;
        return Q[idx];
    }

}











