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
public class ExOhTest {
    private String word;
    private boolean bool;

    public ExOhTest(String word, boolean bool) {
        this.word = word;
        this.bool = bool;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{"xooxxxxooxoo", true}});
    }

    @Test
    public void test() {
        ExOh exOh = new ExOh();
        assertEquals(bool, exOh.isExOh(word));
    }


}