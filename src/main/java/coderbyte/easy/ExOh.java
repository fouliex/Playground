package coderbyte.easy;

/**
 * Have a function that takes a string and return true if there's an equal number of x's and o's.
 * Otherwise returns false
 * Created by fouli on 8/6/2017.
 */
public class ExOh {

    public boolean isExOh(String str) {
        int numberOfX = 0;
        int numberOY = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                numberOfX++;
            }
            if (str.charAt(i) == 'o') {
                numberOY++;
            }

        }
        return numberOfX == numberOY;
    }
}
