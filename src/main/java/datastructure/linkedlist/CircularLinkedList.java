package datastructure.linkedlist;

public class CircularLinkedList {
    private SingleLinkedListNode first;
    private SingleLinkedListNode last;


    public CircularLinkedList(){
        first = null;
        last =null;
    }


    public void insertFirst(int data){
        SingleLinkedListNode newNode = new SingleLinkedListNode();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data){
        SingleLinkedListNode newNode = new SingleLinkedListNode();
        newNode.data =data;

        if(isEmpty()){
            first = newNode;
        }else{
            last.next = newNode; // the next value of the last node will point to the new node
            last = newNode; // we make the new node we created be the last one in the list
        }

    }
    public int deleteFirst(){
        int temp =first.data;

        if(first.next == null){
            last = null;
        }

        first = first.next; // first will point to old's next value

        return temp;
    }


    public void displayList(){
        System.out.println("List (first --> last");
        SingleLinkedListNode current = first;
        while(current !=null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();

    }

    private boolean isEmpty() {
        return first == null;
    }

    public static void main(String[] args) {
            CircularLinkedList mylist = new CircularLinkedList();
            mylist.insertFirst(100);
            mylist.insertFirst(50);
            mylist.insertFirst(99);
            mylist.insertFirst(88);
            mylist.insertLast(999999);
            mylist.displayList();


    }
}
