package designPatterns.creational.singleton;

/**
 * Created by George Fouche on 1/31/17.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        /**
         * Illegal construct
         * Compile Time Error: The constructor SingleObject() is not visible
         */
        //SingleObject object = new SingleObject();

        /**
         * Get the only object available
         */
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}

