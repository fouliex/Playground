package coderbyte.easy;

/**
 * Have a function take a string and return true if the characters a and b
 * are separated by excatly 3 places anywhere in the string at least once.
 * <p>
 * For example "lane borrowed" would return true because there's exactly 3 characters
 * between a and b
 * Created by fouli on 8/3/2017.
 */
public class ABCheck {
    public boolean has3CharactersBetweenAB(String sentence) {
        char[] temp = sentence.toCharArray();
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (temp[i] == 'a' && temp[i + 4] == 'b') {
                return true;
            }
        }
        return false;
    }
}
