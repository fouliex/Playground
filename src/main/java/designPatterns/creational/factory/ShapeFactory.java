package designPatterns.creational.factory;

/**
 * The Factory patterns comes under creational pattern as this pattern provides one of the best ways to create an object.
 * <p>
 * In the Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
 * Created by George Fouche on 1/31/17.
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
