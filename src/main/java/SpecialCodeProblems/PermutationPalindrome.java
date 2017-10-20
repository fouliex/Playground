package SpecialCodeProblems;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an efficient function that checks whether any permutation of an input string is a palindrome.
 */
public class PermutationPalindrome {
    /**
     * The approach is to check that each character appears an even number of times, allowing for only one characters to
     * appear an odd number of times(a middle character). This is enough to determine if a permutation of the input string is a palindrome.
     *
     * @param str
     * @return
     */
    public static boolean hasPalindromePermutation(String str) {
        Set<Character> unpairedCharacters = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (unpairedCharacters.contains(c)) {
                unpairedCharacters.remove(c);
            } else {
                unpairedCharacters.add(c);
            }
        }

        return unpairedCharacters.size() <= 1;
    }

    public static void main(String[] args) {
        System.out.println(hasPalindromePermutation("civic"));
        System.out.println(hasPalindromePermutation("ivicc"));
    }

}
