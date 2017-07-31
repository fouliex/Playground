package coderbyte.easy;

/**
 * Have a function that takes a string parameter and return the largest word in the string
 * Created by fouli on 7/30/2017.
 */
public class LongestWord {

    public String longestWord(String sentence) {
        String longestWord = "";
        String[] value = sentence.split(" ");
        for (String word : value) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
