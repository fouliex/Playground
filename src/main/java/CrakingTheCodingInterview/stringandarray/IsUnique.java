package CrakingTheCodingInterview.stringandarray;

import java.util.Arrays;

/**
 * Implement an algorithm to determine if a stringandarray has all unique characters
 */
public class IsUnique {


    public boolean isUniqueBruteForce(String str){
        for(int i=0; i < str.length(); i++){
            for(int j= i+1;j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }

        }
        return true;
    }

    public boolean isUniqueWithSort(String str){
        char[] chArray = str.toCharArray();
        Arrays.sort(chArray);
        for(int i =0; i < chArray.length-1;i++){
            if(chArray[i] == chArray[i+1]){
                return false;
            }
        }
        return true;

    }





    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        System.out.println(isUnique.isUniqueBruteForce("GeorgeErolFouche"));
        System.out.println(isUnique.isUniqueWithSort("GeorgeErolFouche"));
        System.out.println(isUnique.isUniqueBruteForce("abcdef"));
        System.out.println(isUnique.isUniqueWithSort("abcdef"));
    }
}
