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
public class FirstFactorialTest {
    private int num;
    private int factNum;

    public FirstFactorialTest(int num, int factNum) {
        this.num = num;
        this.factNum = factNum;
    }

    @Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][]{
                {4, 24},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}

        });
    }

    @Test
    public void test() {
        FirstFactorial firstFactorial = new FirstFactorial();
        num = firstFactorial.factor(num);
        assertEquals(factNum, num);
    }
}