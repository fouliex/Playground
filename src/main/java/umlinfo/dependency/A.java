package umlinfo.dependency;


/**
 * Dependency
 *
 * The UML depency relationship is the least formal of them all.
 * It means that the class at the source end of the relationship has some sort of dependency on the class at the target(arrowhead) end of the relationship
 *
 * Created by fouli on 2/4/2017.
 */
public class A {
    public void method(B b){
        // . . .
    }

    public void method2(){
        B tempB = new B();
    }
}
