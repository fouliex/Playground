package leetcode;

/**
 * https://leetcode.com/problems/implement-strstr/description/
 */
public class StrString {

    public int strStrExample1(String haystack, String needle){
        return  haystack.indexOf(needle);
    }

    public int strStrExample2(String haystack, String needle){
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()){
                    return i;
                }
                if (i + j == haystack.length()){
                    return -1;
                }
                if (needle.charAt(j) != haystack.charAt(i + j)){
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new StrString().strStrExample1("This is a simple string","simple"));
        System.out.println(new StrString().strStrExample2("hello","ll"));
    }
}
