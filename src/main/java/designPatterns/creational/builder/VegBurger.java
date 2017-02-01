package designPatterns.creational.builder;

/**
 * The VegBurger extends the Burger class
 * Created by fouli on 2/1/2017.
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
