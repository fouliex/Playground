package coderbyte.easy;

/**
 * Have a function that take a number parameter and return the number of hours and minutes.
 * For example if num =63 then the output should be 1:3.
 * <p>
 * Separate the number of hours and minutes with a colon.
 * Created by fouli on 8/2/2017.
 */
public class TimeConvert {

    public String convert(int num) {
        return String.format("%d:%d", num / 60, num % 60);
    }
}


