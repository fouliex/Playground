package coderbyte.easy;

/**
 * Have a function tthat take a sentence and then capitalize the first letter of each word.
 * Created by fouli on 7/30/2017.
 */
public class LetterCapitalize {

    private static boolean isLowercase(char character) {
        return character >= 'a' && character <= 'z';
    }

    public String toCapitalize(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            char firstLetter = word.charAt(0);
            if (isLowercase(firstLetter)) {
                String capitalLetter = word.replace(firstLetter, (char) (firstLetter - 'a' + 'A'));
                stringBuilder.append(capitalLetter);
            } else {
                stringBuilder.append(word);
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

}
