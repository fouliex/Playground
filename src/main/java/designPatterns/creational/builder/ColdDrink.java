package designPatterns.creational.builder;

/**
 * The abstract class ColdDring implement the item interface providing default functionality
 * Created by fouli on 2/1/2017.
 */
public abstract class ColdDrink  implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
