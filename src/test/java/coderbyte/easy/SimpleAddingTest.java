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
public class SimpleAddingTest {
     private int num;
     private int sum;

    public SimpleAddingTest(int num, int sum) {
        this.num = num;
        this.sum = sum;
    }
    @Parameterized.Parameters
    public static Collection<Integer[]> data(){
        return Arrays.asList(new Integer[][]{
                {1,1},
                {2,3},
                {3,6},
        });
    }
    @Test
    public void testAdd(){
        SimpleAdding simpleAdding = new SimpleAdding();
        num =simpleAdding.add(num);
        assertEquals(sum,num);
    }
}