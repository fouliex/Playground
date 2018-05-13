package coderbyte.easy;

import java.util.Arrays;

/**
 * Have a fucntion that take a StringAndArray and return the StringAndArray with the letters in alphabetical order.
 * For example hello becomes ehllo.
 * Created by fouli on 8/3/2017.
 */
public class AlphabetSoup {

    public String toAlphaORder(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return String.valueOf(letters);
    }

}
