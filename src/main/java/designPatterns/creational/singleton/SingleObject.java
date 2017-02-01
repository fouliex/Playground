package designPatterns.creational.singleton;

/**
 * The Singleton pattern comes under Creational Pattern as this pattern provides one of the best ways to create an object.
 * <p>
 * The Singleton pattern involves a single class which is responsible to create an object while making sure that only single object gets created.
 * <p>
 * This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
 * <p>
 * Created by George Fouche on 1/31/17.
 */
public class SingleObject {
    //Create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //Make the constructor private so it can't get instantiated
    private SingleObject() {
    }

    //Get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
