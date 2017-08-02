package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by fouli on 8/1/2017.
 */
@RunWith(Parameterized.class)
public class SimpleSymbolsTest {
    private String sequence;
    private boolean boo;

    public SimpleSymbolsTest(String sequence, boolean boo) {
        this.sequence = sequence;
        this.boo = boo;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"+d+", true},
                {"ad", false},
                {"d", false},
                {"++d++==++a++==++f++", true},
                {"++d+====+c++==a", false}

        });
    }

    @Test
    public void testIfSequenceStringIsSimpleSymbols() {
        SimpleSymbols simpleSymbols = new SimpleSymbols();
        assertEquals(boo, simpleSymbols.isSimpleSymbols(sequence));
    }
}