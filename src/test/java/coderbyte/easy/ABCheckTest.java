package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by fouli on 8/3/2017.
 */
@RunWith(Parameterized.class)
public class ABCheckTest {
private String sentence;
private boolean bool;

    public ABCheckTest(String sentence, boolean bool) {
        this.sentence = sentence;
        this.bool = bool;
    }

    @Parameterized.Parameters
    public static Collection<Object []> data(){
        return Arrays.asList(new Object[][]{{"lane borrowed",true}});
    }

    @Test
    public void test(){
        ABCheck abCheck = new ABCheck();
        assertEquals(bool,abCheck.has3CharactersBetweenAB(sentence));
    }
}