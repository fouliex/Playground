package designPatterns.creational.builder;

import java.sql.Wrapper;

/**
 * This abstract class Burger implement the item interface providing default functionality
 * Created by fouli on 2/1/2017.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new designPatterns.creational.builder.Wrapper();
    }

    @Override
    public abstract float price();

}
