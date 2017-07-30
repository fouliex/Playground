package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by fouli on 7/30/2017.
 */
@RunWith(Parameterized.class)
public class FirstReverseTest {
    private String word;
    private String reverseWord;

    public FirstReverseTest(String word, String reverseWord) {
        this.word = word;
        this.reverseWord = reverseWord;
    }

    @Parameters
    public static Collection<String[]> data() {
        return Arrays.asList(new String[][]{{"George", "egroeG"}, {"ABCDEF", "FEDCBA"}, {"12345", "54321"}});
    }

    @Test
    public void testReverseWithStringBuilderLibrary() {
        FirstReverse firstReverse = new FirstReverse();
        String newWord = firstReverse.reverseWithStringBuilderLibrary(word);
        assertEquals(reverseWord, newWord);
    }

    @Test
    public void testFirstStringByLetters() {
        FirstReverse firstReverse = new FirstReverse();
        String newWord = firstReverse.reverseByLetter(word);
        assertEquals(reverseWord, newWord);
    }
}
