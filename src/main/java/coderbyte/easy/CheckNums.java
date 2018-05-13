package coderbyte.easy;

/**
 * Have a function that takes 2 parameters and return the StringAndArray true if num2 is greater than num1
 * <p>
 * Created by fouli on 8/1/2017.
 */
public class CheckNums {

    public String check(int num1, int num2) {
        if (num1 < num2) {
            return "true";
        } else if (num1 > num2) {
            return "false";
        } else {
            return "-1";
        }
    }
}
