package coderbyte.easy;

import java.util.HashMap;

/**
 * Have a function that takes a string parameter and replace every letter in the string with the
 * letter  following it in the alphabet(ie. c becomes d, z becomes a).Then capitalize every vowel in this
 * string(a,e,i,0,u) and finally return the modified string
 * Created by fouli on 7/30/2017.
 */
public class LetterChanges {
    public static HashMap<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put(" ", " ");
        dictionary.put("a", "b");
        dictionary.put("b", "c");
        dictionary.put("c", "d");
        dictionary.put("d", "E");
        dictionary.put("e", "f");
        dictionary.put("f", "g");
        dictionary.put("g", "h");
        dictionary.put("h", "I");
        dictionary.put("i", "j");
        dictionary.put("j", "k");
        dictionary.put("k", "l");
        dictionary.put("l", "m");
        dictionary.put("m", "n");
        dictionary.put("n", "O");
        dictionary.put("o", "p");
        dictionary.put("p", "q");
        dictionary.put("q", "r");
        dictionary.put("r", "s");
        dictionary.put("s", "t");
        dictionary.put("t", "U");
        dictionary.put("u", "v");
        dictionary.put("v", "w");
        dictionary.put("w", "x");
        dictionary.put("x", "y");
        dictionary.put("y", "z");
        dictionary.put("z", "A");

    }

    public String changesWithDictionary(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String value = String.valueOf(str.charAt(i));
            if (dictionary.containsKey(value)) {
                String dictionaryValue = dictionary.get(value);
                stringBuilder.append(dictionaryValue);
            } else {
                stringBuilder.append(value);
            }
        }
        return stringBuilder.toString();
    }

    public String changesWithTheNextLetter(String str) {
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < str.length(); index++) {
            char letter = str.charAt(index);
            if ('a' <= letter && letter <= 'z') {
                if (letter == 'z') {
                    letter = 'a';
                } else {
                    letter = (char) (letter + 1);
                }
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    letter = Character.toUpperCase(letter);
                }
            }
            sb.append(letter);
        }
        return sb.toString();
    }

}
