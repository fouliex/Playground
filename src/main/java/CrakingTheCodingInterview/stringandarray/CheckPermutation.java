package CrakingTheCodingInterview.stringandarray;

/**
 * Given two strings, write a method to decide if one is permutation of the other
 */
public class CheckPermutation {

    public boolean isPermutation(String s1, String s2){
         char[]  chArray1 = s1.toCharArray();
         char[] chArray2 = s2.toCharArray();

         for(int i =0; i < chArray1.length;i++){
             if(chArray1[i] == chArray2[i]){
                 return true;
             }
         }
         return false;
    }


    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bdca";
        String s3 = "aecd";
        System.out.println(new CheckPermutation().isPermutation(s1,s3));
    }

}
