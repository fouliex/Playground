package designPatterns.creational.prototype;

/**
 * Created by George Fouche on 2/3/17.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
