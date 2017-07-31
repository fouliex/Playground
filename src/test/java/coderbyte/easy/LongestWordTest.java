package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

/**
 * Created by fouli on 7/30/2017.
 */
@RunWith(Parameterized.class)
public class LongestWordTest {
    private String sentence;
    private String word;

    public LongestWordTest(String sentence, String word) {
        this.sentence = sentence;
        this.word = word;
    }

    @Parameters
    public static Collection<String[]> data() {
        return Arrays.asList(new String[][]{{"I love dogs", "love"}, {"Comment ca vas", "Comment"}});
    }

    @Test
    public void test() {
        LongestWord longestWord = new LongestWord();
        longestWord.longestWord(sentence);
        assertEquals(word,longestWord.longestWord(sentence));
    }


}