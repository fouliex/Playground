package SpecialCodeProblems;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Implement aqueue with 2 stacks. The queue should have an enqueue and a dequeue function and it should be FIFO.
 * Created by fouli on 10/19/2017.
 */
public class QueueTwoStacks {

    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();

    public void enqueue(int num) {
        inStack.push(num);
    }

    public int dequeue() {
        if (outStack.isEmpty()) {
            // Move items from inStack to outStack, reversing order
            while (!inStack.empty()) {
                int newestInStackItem = inStack.peek();
                outStack.push(newestInStackItem);
                inStack.pop();
            }
            // If outStack is still empty, raise an error
            if (outStack.empty()) {
                throw new NoSuchElementException("Can't dequeue from empty queue!");
            }
        }
        return outStack.pop();
    }


}
