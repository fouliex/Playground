package coderbyte.easy;

/**
 * Have a function that add up all the numbers from 1 to num
 * Created by fouli on 7/30/2017.
 */
public class SimpleAdding {

    public int add(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

}
