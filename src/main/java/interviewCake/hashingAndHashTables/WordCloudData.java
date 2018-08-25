package interviewCake.hashingAndHashTables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George Fouche on 8/24/18.
 */
public class WordCloudData {

    public static List<String> splitWords(String inputString){
        List<String> words = new ArrayList<>();

        int currentWordStartIndex = 0;
        int currentWordLength = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (Character.isLetter(c)) {
                if (currentWordLength == 0) {
                    currentWordStartIndex = i;
                }
                currentWordLength++;
            } else {
                String currentWord = inputString.substring(currentWordStartIndex,
                        currentWordStartIndex + currentWordLength);
                words.add(currentWord);
                currentWordLength = 0;
            }
        }

        return words;
    }
    public static void main(String[] args) {
        String sentence1 =  "After beating the eggs, Dana read the next step:\" Add milk and eggs, then add flour and sugar.\"";
        System.out.println(splitWords(sentence1));
    }
}
