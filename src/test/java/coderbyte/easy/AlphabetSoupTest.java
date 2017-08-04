package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by fouli on 8/3/2017.
 */
@RunWith(Parameterized.class)
public class AlphabetSoupTest {
    private String word;
    private String inOrderWord;

    public AlphabetSoupTest(String word, String inOrderWord) {
        this.word = word;
        this.inOrderWord = inOrderWord;
    }

    @Parameters
    public static Collection<String[]> data() {
        return Arrays.asList(new String[][]{{"hello", "ehllo"}});
    }

    @Test
    public void testToAlphaOrder() {
        AlphabetSoup alphabetSoup = new AlphabetSoup();
        assertEquals(inOrderWord, alphabetSoup.toAlphaORder(word));
    }
}