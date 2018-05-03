package CrackingTheCodingInterview;

/**
 * Write a program that prints the number from 1 to 100.
 * But for multiples of three print "Fizz" instead of the number and for the mutiples of 5 print "BUZZ".
 * For number which are multiples of both three and five print "FizzBuzz"
 * Created by fouli on 8/11/2017.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String temp = "";
            String result = temp;
            if (i % 3 == 0) {
                result += "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            if (result.isEmpty()) {
                result += i;
            }
            System.out.println(result);
        }
    }
}
