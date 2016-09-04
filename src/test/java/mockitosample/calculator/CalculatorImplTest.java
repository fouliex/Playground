package mockitosample.calculator;

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by 212361198 on 8/27/16.
 */
@RunWith(Parameterized.class)
public class CalculatorImplTest {
    enum Type {SUBTRACT, ADD}

    int num1;
    int num2;
    int expectedResult;
    Type type;

    public CalculatorImplTest(Type type, int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.expectedResult = result;

    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{Type.ADD, -1, 2, 1}, {Type.ADD, 1, 2, 3}, {Type.ADD, 6, 7, 13}, {Type.SUBTRACT, 1, 2, -1}});
    }


    @Test
    public void addShouldReturnAResult() {
        if (type == Type.ADD) {
            Calculator c = new CalculatorImpl();
            int actual = c.add(num1, num2);
            assertEquals(expectedResult, actual);

        }

    }

    @Test
    public void subtractReturnAResult() {
        if (type == Type.SUBTRACT) {
            Assume.assumeTrue(type == Type.SUBTRACT);
            Calculator c = new CalculatorImpl();
            int actual = c.subtract(num1, num2);
            assertEquals(expectedResult, actual);
        }
    }
}