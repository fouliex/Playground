package designPatterns.creational.prototype;

import java.util.Hashtable;

/**
 * The Prototype pattern refers to creating duplicate object while keeping performance in mind.
 *
 * The pattern involves implementing a prototype interface which tells to create a clone of the current object.This
 * pattern is used when creation of object directly is costly.
 * For example, an object is to be created after a costly database operation.We can cache the object, returns
 * its clone on next request and update the database as and when needed thus reducing database callse.
 *
 *
 * Created by fouli on 2/2/2017.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * For each shape run database query and create shape
     * shapeMap.put(shapeKey,shape);
     * for example, we are adding three shapes
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }


}
