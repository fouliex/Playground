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
        if(rear == maxSize -1){
            rear = -1;
        }
        rear++;
        queArray[rear]=j;
        nItems++;
    }

    /**
     * Remove item from the front of the queue
     * @return
     */
    public long remove(){
        long temp = queArray[front];
         if(front == maxSize){
             front =0;
         }
         nItems--;
         return temp;
    }

    public long peek(){
        return queArray[front];
    }

    public boolean isEmptry(){
        return (nItems ==0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.println("[ ");
        for(int i=0; i<queArray.length;i++){
            System.out.println(queArray[i]+ " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        TheQueue queue = new TheQueue(5);
        queue.insert(100);
        queue.insert(1000);
        queue.view();


    }
}
