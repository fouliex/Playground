package designPatterns.creational.prototype;

/**
 * Created by George Fouche on 2/3/17.
 */
public class prototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
    }
}
