package CrakingTheCodingInterview.stringandarray;

/**
 * Implement a method to perform basic stringandarray compression using the counts or repeated characters. For example, the
 * stringandarray aabccccaaa would become a2b1c3a3. if the "compressed" stringandarray would not become smaller than the original stringandarray,
 * your method should return the original stringandarray. You can assume the stringandarray has only uppercase and lowercase letters(a-z)
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
