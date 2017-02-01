package designPatterns.creational.factory;

/**
 * FactoryPatternDemo use ShapeFactory to get a Shape object.
 * I passes information (CIRCLE/RECTANGLE/SQUARE) to ShapeFactory to get the type of object it needs.
 * Created by George Fouche on 1/31/17.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        /**
         * Get an object of Circle and call its draw method and
         */
        Shape circleShape = shapeFactory.getShape("Circle");
        circleShape.draw();


        /**
         * Get an object of Square and call its draw method.
         */
        Shape squareShape = shapeFactory.getShape("Square");
        squareShape.draw();

        /**
         * Get an object of Rectangle and call its draw method.
         */
        Shape rectangleShape = shapeFactory.getShape("Rectangle");
        rectangleShape.draw();
    }
}
