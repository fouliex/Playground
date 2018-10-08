package interviewCake.hashingAndHashTables;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Write an efficient method that checks whether any permutation
 * Created by George Fouche on 8/22/18.
 */
public class PermutationPalindrome {
    /**
     * A string is a palindrome permutation if it has 1 or 0 characters without a pair.
     * @param theString
     * @return
     */
  public static boolean hashPalindromePermutation(String theString){
      Set<Character> unpairedCharacters = new HashSet<>();

      for(char c: theString.toCharArray()){
          if(unpairedCharacters.contains(c)){
              unpairedCharacters.remove(c);
          }else{
              unpairedCharacters.add(c);
          }
      }

      return unpairedCharacters.size() <=1;

  }
    public static void main(String[] args) {
        String stg1 = "civic";
        String stg2 = "ivicc";
        String stg3 = "civil";
        String stg4 = "livci";

        System.out.println(hashPalindromePermutation(stg1));
        System.out.println(hashPalindromePermutation(stg3));


    }
}
