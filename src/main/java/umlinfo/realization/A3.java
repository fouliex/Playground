package umlinfo.realization;

/**
 * * Realization represents the implementation of an interface by a class.
 * So it represents how some characteristics of a class are defined,but
 * says nothing about the implementation details.
 * <p>
 * A3 implements or realizes the interface defined by B3.
 * <p>
 * Realization is very important when designing object-oriented subsystems and frameworks.
 * The  interface publisher guarantees that any consumer implementing one or more of its public
 * interfaces  properly will have some level of consistent integration with the interface-defining
 * subsystem or framework.
 * <p>
 * Created by George Fouche on 2/9/17.
 */
public class A3 implements B3 {
    @Override
    public void b3Method() {
        // . . .
    }
}
