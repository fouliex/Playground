package coderbyte.easy;

/**
 * Have a function that take  a number parameter and return the factorialTailRecursion of it.
 * Created by fouli on 7/30/2017.
 */
public class FirstFactorial {

    public int factor(int num) {
        int fact = 1;
        while (num > 0) {
            fact *= num--;
        }
        return fact;
    }
}
