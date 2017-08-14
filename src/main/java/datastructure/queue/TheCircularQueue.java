package datastructure.queue;

/**
 * Created by fouli on 8/10/2017.
 */
public class TheCircularQueue {
    private int[] items = new int[5];
    private int head = -1;
    private int tail = -1;
    private int numOfItems = 0;

    public TheCircularQueue() {

    }

    public TheCircularQueue(int size) {
        this.items = new int[size];
    }

    public void enqueue(int item) {
        if (isFull())
            throw new RuntimeException("Queue is full");
        if (tail == items.length - 1)//deal with circular case
            tail = -1;
        items[++tail] = item;
        numOfItems++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        if (head == items.length - 1)
            head = -1;
        numOfItems--;
        return items[++head];
    }

    public int peek() {
        return items[head + 1];
    }

    public boolean isFull() {
        return numOfItems == items.length;
    }

    public boolean isEmpty() {
        return numOfItems == 0;
    }

    public static void main(String[] args) {
        TheCircularQueue queue = new TheCircularQueue();
        System.out.println(queue.isEmpty());
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());

    }

}
