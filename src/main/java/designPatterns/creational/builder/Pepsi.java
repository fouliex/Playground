package designPatterns.creational.builder;

/**
 * Created by fouli on 2/1/2017.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 53.0f;
    }
}
