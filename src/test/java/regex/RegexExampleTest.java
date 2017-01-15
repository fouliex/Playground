package regex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;
import static regex.RegexDefinedCharacter.*;

/**
 * Created by George Fouche on 1/11/17.
 */
@RunWith(Parameterized.class)
public class RegexExampleTest {


    String content;
    RegexDefinedCharacter pattern;
    private RegexExample regexExample;

    public RegexExampleTest(String content,RegexDefinedCharacter pattern) {
        this.content = content;
        this.pattern = pattern;
        regexExample = new RegexExample();

    }

    @Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[][]{{"1", ADIGIT},
                                            {"A", ANONDIGIT},
                                            {"A", ANONWHITESACE},
                                            {" ", AWHITESPACE},
                                            {"hello",RegexDefinedCharacter.AWORD}
                                            });
    }

    @Test
    public void testRegexCharacters() {
        assertTrue(regexExample.validated(content,pattern));
    }





}
