package mockitosample.useradminservice;


/**
 * Created by fouli on 9/4/2016.
 */
public class UserDAO {

    public int create(User user) {
        int id = IDGenerator.generateID();
        //Save the user object to the db
        return id;
    }
}
