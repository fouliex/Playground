package coderbyte.easy;

/**
 * Have a function that takes a string  and return the string true if the parameter is a palindrome.
 * <p>
 * Palindrome means that the string is the same forward as it is backward.
 * <p>
 * Created by fouli on 8/6/2017.
 */
public class Palindrome {
    public boolean isPalindrome(String str) {
        String originalString = new String(str.replace("\\s", ""));
        StringBuilder stringBuilder = new StringBuilder(originalString);
        String reverseString = stringBuilder.reverse().toString();
        return reverseString.equals(originalString);
    }

}
