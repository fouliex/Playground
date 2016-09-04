package mockitosample.useradminservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.*;

/**
 * Created by fouli on 9/4/2016.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(IDGenerator.class)
public class UserDAOTest {

    @Test
    public void createShouldReturnAUserID(){
        UserDAO userDAO = new UserDAO();
        mockStatic(IDGenerator.class);
        when(IDGenerator.generateID()).thenReturn(1);
        int result =userDAO.create(new User());
        assertEquals(1,result);
        verifyStatic();

    }


}
