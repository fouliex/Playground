package coderbyte.easy;

/**
 * Have a function that take  a StringAndArray parameter and determine that the StringAndArray is an acceptable sequence by either
 * returning the StringAndArray true or false.
 * <p>
 * The StringAndArray parameter will be composed of + and = symbols with several letters between them( ie. ++d+====+c++==a)
 * and for the StringAndArray to be true each letter must be surrounded by a + symbol. So the StringAndArray to the left would be false.
 * The StringAndArray will not be empty and will have at least one letter.
 * <p>
 * <p>
 * Created by fouli on 8/1/2017.
 */
public class SimpleSymbols {

    private static boolean isLowercase(char character) {
        return character >= 'a' && character <= 'z';
    }

    private static boolean isUppercase(char character) {
        return character >= 'A' && character <= 'Z';
    }

    private static boolean isLetter(char character) {
        return isLowercase(character) || isUppercase(character);
    }

    public boolean isSimpleSymbols(String str) {
        // edge cases
        if (isLetter(str.charAt(0)) || isLetter(str.charAt(str.length()-1)))
            return false;

        // middle cases
        for (int i = 1; i < str.length()-1; i++)
            if (isLetter(str.charAt(i)) && (str.charAt(i-1) != '+' || str.charAt(i+1) != '+'))
                return false;

        return true;
    }
}
