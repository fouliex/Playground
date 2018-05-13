package datastructure.linkedlist;

import java.util.HashSet;


class Node<Integer> {

    private int data;
    private Node<Integer> nextNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node<Integer> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<Integer> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return  "Data:" + this.data ;
    }
}


public class LinkedList<Integer> {
    private Node<Integer> head;

    public void addAtStart(int data){
        Node<Integer> newNode = new Node<Integer>(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }


    public void removeDuplicate(){
        HashSet hs = new HashSet<>();

        Node<Integer> current = this.head;
        Node<Integer> prev = null;

        while(current != null){
            int curval = current.getData();
            if(hs.contains(curval)){
               prev.setNextNode(current.getNextNode());
            }else{
                hs.add(curval);
                prev = current;
            }
            current = current.getNextNode();
        }

    }

    public  Node<Integer> deleteAtStart(){
        Node<Integer> toDel = this.head;
        this.head = this.head.getNextNode();
        return toDel;
    }

    public Node<Integer>getHead(){
        return this.head;
    }

    public Node<Integer> find(int data){
        Node current = this.head;

        while(current != null){
            if(current.getData() == data){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int length =0;
           Node<Integer> current = this.head;
           while(current !=null){
               length += 1;
               current = current.getNextNode();
           }
           return length;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;
        while (current != null){
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }

    public static void main(String[] args) {
           LinkedList list = new LinkedList();
        System.out.println(list.getHead());
           list.addAtStart(2);
           list.addAtStart(10);
           list.addAtStart(5);
           list.addAtStart(12);
           list.addAtStart(12);
           list.addAtStart(19);
           list.addAtStart(20);
        System.out.println(list.length());
        System.out.println(list);
        list.deleteAtStart();
        System.out.println(list.find(12));
        list.removeDuplicate();
        System.out.println(list);
    }
}
