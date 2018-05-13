package leetcode;

public class LongestCommonPrefix {

    public String mostCommonPrefix(String[] strs){
        if(strs == null){
            throw new NullPointerException("Array is null");
        }
        if(strs.length ==0){
            return "";
        }
        return mostCommonPrefixHelper(strs,findMin(strs));
    }

    private String mostCommonPrefixHelper(String[] array, String min) {
        for(int i =0; i <array.length;i++){
            if(!array[i].startsWith(min)){
                return mostCommonPrefixHelper(array,min.substring(0,min.length()-1));
            }
        }
        return min;
    }

    private String findMin(String[] array) {
        String min = array[0];
         for(String arrayElement : array){
             if(arrayElement.length() < min.length()){
                 min = arrayElement;
             }
         }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().mostCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(new LongestCommonPrefix().mostCommonPrefix(new String[]{"aaa","aab","aa","ab"}));

    }
}
