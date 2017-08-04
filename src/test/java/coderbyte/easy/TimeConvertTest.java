package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by fouli on 8/2/2017.
 */
@RunWith(Parameterized.class)
public class TimeConvertTest {
    private int num;
    private String expectedTime;

    public TimeConvertTest(int num, String expectedTime) {
        this.num = num;
        this.expectedTime = expectedTime;
    }

    @Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[][]{{63, "1:3"}});
    }

    @Test
    public void testTimeConvertConvertMethod() {
        TimeConvert timeConvert = new TimeConvert();
        assertEquals(expectedTime, timeConvert.convert(num));

    }
}