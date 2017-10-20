package SpecialCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciNumber {

    public int computefib(int num){
       //fib(n) = fib(n-1) + fib(n-2)
        if(num == 0){
            return num;
        }

        if(num == 1){
            return num;
        }

        return computefib(num -1) + computefib(num -2);
    }

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.computefib(4));
        ArrayList<Integer> list = new ArrayList();


    }
}
