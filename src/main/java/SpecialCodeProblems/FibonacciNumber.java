package SpecialCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciNumber {

    public int computefib(int num){
       //fib(n) = fib(n-1) + fib(n-2)
        if(num == 1){
            return 1;
        }

        if(num == 2){
            return 1;
        }

        return computefib(num -1) + computefib(num -2);
    }

    public int computefib2(int n){
        int [] fib =  new int[n+1];
        fib[1] =1;
        fib[2] = 1;

        for(int i = 3; i<= n; i++){
            fib[i] = fib[i-1]+ fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.computefib(9));
        System.out.println(fibonacciNumber.computefib2(9));



    }
}
