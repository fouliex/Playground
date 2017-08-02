package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by fouli on 8/1/2017.
 */
@RunWith(Parameterized.class)
public class CheckNumsTest {
    private int num1;
    private int num2;
    private String isNum2Greater;

    public CheckNumsTest(int num1, int num2, String isNum2Greater) {
        this.num1 = num1;
        this.num2 = num2;
        this.isNum2Greater = isNum2Greater;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2, "true"},
                {5, 4, "false"},
                {2, 2 + 3, "true"},
                {3, 3, "-1"},
        });
    }

    @Test
    public void testCheckNumsCheck() {
        CheckNums checkNums = new CheckNums();
        assertEquals(isNum2Greater, checkNums.check(num1, num2));
    }


}