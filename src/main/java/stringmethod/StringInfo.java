package stringmethod;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by George Fouche on 1/4/17.
 */
public class StringInfo {
    /**
     * charAt()
     * The method chartAt(int index) returns the character at the specified index.
     * The index value should lie between 0 and length()-1.
     */
    public void useChartAt(String str) {
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            System.out.print(character + " ");
        }
    }

    /**
     * getChars()
     * cf apiThe method getChars() is used for copying String characters to an Array of chars.
     * Parameters description:
     * srcBegin - index of the first character in the StringAndArray to copy.
     * srcEnd - index after the last character in the StringAndArray to copy
     * dest - Destination array of characters in which the characters from String get copied.
     * destBegin - The index in Array starting from where the chars will be pushed into the Array.
     */
    public void useGetChars(String str) {
        char[] array = new char[6];
        str.getChars(10, 16, array, 0);
        for (char character : array) {
            System.out.println(character);
        }
    }

    public void convertInputStreamToString() throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        InputStream inputStream = new ByteArrayInputStream("This is the content of my file".getBytes());
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String content;
        while ((content = bufferedReader.readLine()) != null) {
            stringBuilder.append(content);
        }

        inputStream.close();
        inputStreamReader.close();
        bufferedReader.close();

        System.out.println(stringBuilder.toString());
    }

    public void countDupChars(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        for (Character character : chars) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }

        Set<Character> keys = map.keySet();
        for (Character character : keys) {
            if (map.get(character) > 1) {
                System.out.println("Char " + character + " " + map.get(character));
            }
        }

    }

    public static void main(String[] args) {
        StringInfo stringInfo = new StringInfo();
        stringInfo.countDupChars("Geeorge Erooool Fouche");
    }
}
