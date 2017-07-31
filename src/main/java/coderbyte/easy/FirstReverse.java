package coderbyte.easy;

/**
 * Have a function that takes a string parameter and return the string in reversed order.
 * Created by fouli on 7/30/2017.
 */
public class FirstReverse {

    public String reverseWithStringBuilderLibrary(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String reverseByLetter(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = str.split("");
        for (int index = words.length - 1; index >= 0; index--) {
            stringBuilder.append(words[index]);
        }
        return stringBuilder.toString();
    }
}
