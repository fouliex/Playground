package umlinfo.badependency;

/**
 * In this example class B is used to define the state of an instance of class A by declaring an instance of class B with the instance scope.
 * <p>
 * However, this is a misinterpreration of the dependency relationship.It is actually  an Association.
 * Created by fouli on 2/4/2017.
 */
public class A {
    private B b; // wrong

    public B getB() {
        return b;
    }
}
