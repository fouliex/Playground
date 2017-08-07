package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by fouli on 8/6/2017.
 */
@RunWith(Parameterized.class)
public class WordCountTest {
    private String word;
    private int wordLength;

    public WordCountTest(String word, int wordLength) {
        this.word = word;
        this.wordLength = wordLength;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{"Alligator", 8}});
    }

    @Test
    public void test() {
        WordCount wordCount = new WordCount();
        assertEquals(wordLength, wordCount.countsWord(word));
    }
}