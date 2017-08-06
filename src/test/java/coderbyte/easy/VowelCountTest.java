package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by George Fouche on 8/4/17.
 */
@RunWith(Parameterized.class)
public class VowelCountTest {
    private String sentence;
    private int count;


    public VowelCountTest(String sentence, int count) {
        this.sentence = sentence;
        this.count = count;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{"All cows eat grass", 5}});
    }

    @Test
    public void test() {
        VowelCount vowelCount = new VowelCount();
        assertEquals(count, vowelCount.countVowel(sentence));
    }
}