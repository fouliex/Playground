package umlinfo.association;

/**
 * Association defines dependency, but a much strong dependency than the Dependency relationship.
 * <p>
 * The arrowhead means that there is a one-way relationship.In this example it means that class A1 is associated with class B1.
 * In other words,class A1 uses and contains one instance of class B1,but B1 does not know about or contain any instances of class A1.
 * Created by fouli on 2/4/2017.
 */
public class A1 {
    private B1 b1;

    public B1 getB1(){
        return b1;
    }
}
