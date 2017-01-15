package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by George Fouche on 1/9/17.
 */
public class RegexExample {

    public boolean validated(String content, RegexDefinedCharacter character) {
        Pattern pattern = Pattern.compile(String.valueOf(character), Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        return matcher.matches();

    }

}
