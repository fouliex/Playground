package datastructure.linkedlist;

public class Node<Integer> {

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
