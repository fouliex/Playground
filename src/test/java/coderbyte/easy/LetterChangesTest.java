package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by fouli on 7/30/2017.
 */
@RunWith(Parameterized.class)
public class LetterChangesTest {
    private String expected;
    private String actual;


    public LetterChangesTest(String actual, String expected) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<String[]> data() {
        return Arrays.asList(new String[][]{
                {"replace!*", "sfqmbdf!*"},
                {"coderbyte", "dpEfsczUf"},
                {"beautiful^", "cfbvUjgvm^"},
                {"oxford", "pygpsE"},
                {"123456789ae", "123456789bf"},
                {"this long cake@&", "UIjt mpOh dblf@&"},
                {"a confusing /:sentence:/[ this is not!!!!!!!~", "b dpOgvtjOh /:tfOUfOdf:/[ UIjt jt OpU!!!!!!!~"}
        });
    }

    @Test
    public void testChangesWithDictionary() {
        LetterChanges letterChanges = new LetterChanges();
        actual = letterChanges.changesWithDictionary(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testChangesWithTheNextLetter(){
        LetterChanges letterChanges = new LetterChanges();
        actual = letterChanges.changesWithTheNextLetter(actual);
        assertEquals(expected,actual);
    }

}