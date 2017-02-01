package designPatterns.creational.factory;

/**
 * Created by George Fouche on 1/31/17.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        /**
         * get an object of Circle and call its draw method and
         * call draw method of Circle
         */
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

    }
}
