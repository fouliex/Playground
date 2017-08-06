package coderbyte.easy;

import java.util.ArrayList;

/**
 * Have a function that takes a string and return the number of vowels the string contains
 * <p>
 * For example "All cows eat grass" would return 5.
 * <p>
 * Don't count y as a vowel.
 * Created by George Fouche on 8/4/17.
 */
public class VowelCount {

    public int countVowel(String str) {
        int count = 0;
        str = str.toLowerCase();
        char[] letters = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}
