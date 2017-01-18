package Recursion;

/**
 * Created by George Fouche on 1/14/17.
 */
public class Factorial {

    int fact(int num) {
        int result;
        if (num == 1) {
            return 1;
        }
        result = fact(num - 1) * num;
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(4));
    }
}
