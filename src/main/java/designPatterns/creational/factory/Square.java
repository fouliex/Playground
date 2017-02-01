package designPatterns.creational.factory;

/**
 * Created by George Fouche on 1/31/17.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
