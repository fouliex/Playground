package datastructure.stack;

import java.util.Arrays;

/**
 * Created by fouli on 8/9/2017.
 */
public class TheStack {
    private int[] items = new int[100];
    //Index to keep track of the top most element
    private int top = -1;

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int item) {
        if (top == items.length - 1)
            throw new RuntimeException("Stack is full");
        items[++top] = item;
    }

    public int pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return items[top--];
    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return items[top];
    }

    public static void main(String[] args) {
        TheStack stack = new TheStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        while(!stack.isEmpty()){
            int value = stack.pop();
            System.out.println(value);
        }

    }

}
