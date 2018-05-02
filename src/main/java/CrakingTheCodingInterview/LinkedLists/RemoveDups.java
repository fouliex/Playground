package CrakingTheCodingInterview.LinkedLists;

import java.util.HashSet;

/**
 * Write code to remove duplicates from an unsorted linked list
 */


class Node<T>{
 private int data;
 private Node<T> nextNode;


 public Node(int data){
     this.data = data;
 }


 public int getData(){
     return data;
 }

 public Node<T>getNexNode(){
     return nextNode;
 }

 public void setNextNode(Node<T>nextNode){
     this.nextNode = nextNode;
 }

    @Override
    public String toString() {
        return "Data: " + this.data;
    }
}
public class RemoveDups {

    private  Node head;


    public void add(int data) {
        Node addNode = new Node(data);
        addNode.setNextNode(this.head);
        this.head = addNode;
    }

    public void removeDuplicate(){
        HashSet hs = new HashSet<>();

        Node current = this.head;
        Node prev = null;

        while(current !=null){
            if(hs.contains(current.getData())){
                prev.setNextNode(current.getNexNode());
            }else{
                hs.add(current.getData());
                prev = current;
            }
            current = current.getNexNode();
        }
    }



    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;
        while (current != null){
            result += current.toString() + ",";
            current = current.getNexNode();
        }
        result += "}";
        return result;
    }

    public static void main(String[] args) {
         RemoveDups list = new RemoveDups();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(2);
         list.add(4);
         list.removeDuplicate();
        System.out.println(list);
    }


}
