package datastructure.linkedlist;

class SingleLinkedListNode {
    int data;
    SingleLinkedListNode next;

    public void displayNode() {
        System.out.println("{" +data+ "}");
    }
}

public class SingleLinkedList {

    private SingleLinkedListNode first;

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        SingleLinkedListNode newNode = new SingleLinkedListNode();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public SingleLinkedListNode deleteFirst() {
        SingleLinkedListNode temp = first;
        first = first.next;
        return temp;
    }

    /**
     * This is not efficient. We can do better.
     * @param data
     */
    public void insertLast(int data){
        SingleLinkedListNode current = first;
          while(current.next !=null){
              current  = current.next;
          }
          SingleLinkedListNode newNode = new SingleLinkedListNode();
          newNode.data =data;
          current.next = newNode;
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

    public static void main(String[] args) {
        SingleLinkedList mylist = new SingleLinkedList();
        mylist.insertFirst(100);
        mylist.insertFirst(50);
        mylist.insertFirst(99);
        mylist.insertFirst(88);
        mylist.insertLast(999999);
        mylist.displayList();

    }
}
