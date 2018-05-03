package Recursion;

public class Factorial {


    public int factorial(int n) {
        return fact(1, n);
    }

    private int fact(int accumulator, int n) {
        if (n == 1) return accumulator;

        return fact(accumulator * n, n - 1);
    }

    public int factorial2(int n) {
        if (n == 1) return 1;

        return n * factorial2(n - 1);
    }


    public static void main(String[] args) {
        System.out.println(new Factorial().factorial2(100));
        System.out.println(new Factorial().factorial(4));

    }
}
