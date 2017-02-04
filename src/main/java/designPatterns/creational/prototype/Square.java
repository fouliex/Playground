package designPatterns.creational.prototype;

/**
 * Created by George Fouche on 2/3/17.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
