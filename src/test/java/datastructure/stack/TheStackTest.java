package datastructure.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fouli on 8/10/2017.
 */
public class TheStackTest {


    @Test
    public void testPush() {
        int pushValue = 2;
        TheStack theStack = new TheStack();
        theStack.push(pushValue);
        assertEquals(pushValue, theStack.peek());
    }


    @Test
    public void testPoP() {
        int pushValue = 2;
        int pushValue2 = 3;
        TheStack theStack = new TheStack();
        theStack.push(pushValue);
        theStack.push(pushValue2);
        theStack.pop();
        assertEquals(pushValue, theStack.peek());
    }
}