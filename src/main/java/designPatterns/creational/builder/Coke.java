package designPatterns.creational.builder;

/**
 * Created by fouli on 2/1/2017.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return  50.5f;
    }
}
