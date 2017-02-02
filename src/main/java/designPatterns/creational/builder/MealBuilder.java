package designPatterns.creational.builder;

/**
 * The Builder pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * <p>
 * A Builder class builds the final object step by step. This builder is independent of other objects.
 * <p>
 * Created by fouli on 2/1/2017.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem((new Coke()));
        return meal;
    }

    public Meal prepapreNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem((new ChickenBurger()));
        meal.addItem(new Pepsi());
        return meal;
    }
}
