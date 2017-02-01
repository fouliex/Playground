package designPatterns.creational.builder;

/**
 * Created by fouli on 2/1/2017.
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
