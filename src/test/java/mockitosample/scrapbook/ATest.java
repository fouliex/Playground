package mockitosample.scrapbook;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

/**
 * Created by 212361198 on 8/20/16.
 */
public class ATest {
    @Mock
    B b;
    private A a;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        a = new A(b);
    }

    @Test
    public void usesVoidMethodShouldCallTheVoidMethod() throws Exception {
        doNothing().when(b).voidMethod();
        assertEquals(1, a.useVoidMethod());
        verify(b).voidMethod();

    }

    @Ignore
    public void useVoidMethoShouldThrowRuntimeException() {
        try {
            doThrow(Exception.class).when(b).voidMethod();
        } catch (Exception e) {
            assertEquals("??",e);
        }
        a.useVoidMethod();

    }

    @Ignore
    public void testConsecutiveCalls() throws Exception {
        doNothing().doThrow(Exception.class).when(b).voidMethod();
        a.useVoidMethod();
        verify(b).voidMethod();
        a.useVoidMethod();

    }
}