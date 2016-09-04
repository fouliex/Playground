package mockitosample.orderprocessing.bo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 212361198 on 8/23/16.
 */
public class ListTest {
    @Spy
    List<String> myList = new ArrayList<String>();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test(){
        myList.add("George");
        myList.add("Erol");

        Mockito.doReturn(3).when(myList).size();
        Assert.assertSame(3,myList.size());

    }

}
