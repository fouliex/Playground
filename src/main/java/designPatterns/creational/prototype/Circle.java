package designPatterns.creational.prototype;

/**
 * Created by George Fouche on 2/3/17.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
