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
public class LetterCapitalizeTest {
    private String sentence;
    private String sentenceWithCap;


    public LetterCapitalizeTest(String sentence, String sentenceWithCap) {
        this.sentence = sentence;
        this.sentenceWithCap = sentenceWithCap;
    }

    @Parameters
    public static Collection<String[]> data() {
        return Arrays.asList(new String[][]{
                {"comment ca vas", "Comment Ca Vas"},
                {"how are you doing", "How Are You Doing"},
                {"how old are you","How Old Are You"}


        });
    }

    @Test
    public void test() {
        LetterCapitalize letterCapitalize = new LetterCapitalize();
        sentence = letterCapitalize.toCapitalize(sentence);
        assertEquals(sentenceWithCap, sentence);
    }

}