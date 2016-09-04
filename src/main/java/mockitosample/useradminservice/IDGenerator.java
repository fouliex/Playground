package mockitosample.useradminservice;

/**
 * Created by fouli on 9/4/2016.
 */
public class IDGenerator {

    static int i;

    public static final int generateID(){
        return i++;
    }
}
