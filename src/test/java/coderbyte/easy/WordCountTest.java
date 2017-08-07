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
    private String sentence;
    private int wordLength;

    public WordCountTest(String sentence, int wordLength) {
        this.sentence = sentence;
        this.wordLength = wordLength;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{"Hello Word", 2}});
    }

    @Test
    public void test() {
        WordCount wordCount = new WordCount();
        assertEquals(wordLength, wordCount.countsWord(sentence));
    }
}