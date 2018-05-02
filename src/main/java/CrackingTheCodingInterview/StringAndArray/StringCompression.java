package CrackingTheCodingInterview.StringAndArray;

/**
 * Implement a method to perform basic StringAndArray compression using the counts or repeated characters. For example, the
 * StringAndArray aabccccaaa would become a2b1c3a3. if the "compressed" StringAndArray would not become smaller than the original StringAndArray,
 * your method should return the original StringAndArray. You can assume the StringAndArray has only uppercase and lowercase letters(a-z)
 */
public class StringCompression {

    public String compress(String str){
        StringBuilder compressed = new StringBuilder();

        int count =0;
        for(int i =0; i< str.length();++i){
            ++count;
            if(i +1 >=str.length()|| str.charAt(i) != str.charAt(i+1)){
                compressed.append(str.charAt(i));
                compressed.append(count);
                count =0;
            }
        }
        return compressed.length() <str.length()? compressed.toString():str;
    }

    public static void main(String[] args) {

        System.out.println(new StringCompression().compress("aabcccccaaa"));


    }

}
