package designPatterns.creational.factory;

/**
 * Created by George Fouche on 1/31/17.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
