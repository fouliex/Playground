package datastructure.queue;

public class TheQueue {

    private int maxSize; // initializes the set number of slots
    private long[]queArray; // slots to main the data
    private int front; // this will be the index position for the element in the front
    private int rear; // going to be the index position for the element at the back of the line
    private int nItems; // counter to maintain the number of items in our queue

    public TheQueue(int size) {
        this.maxSize = size;
        this.queArray =  new long[size];
        this.front = 0;
        this.rear =  -1;
    }

    public void insert(long j){
        rear++;
        queArray[rear]=j;
        nItems++;
    }

    public void view(){
        System.out.println(" ");
    }
}
