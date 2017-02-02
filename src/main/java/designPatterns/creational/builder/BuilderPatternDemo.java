package designPatterns.creational.builder;

/**
 * This Demo demonstrate a business case of fest-food restaurant where a typical meal could be a burger and a cold drink.
 * The Burger could be either a Veg Burger or Chicken Burger and will be packed by a wrapper.
 * The Cold drink could be either a coke or pepsi and will be packed in a bottle.
 * <p>
 * An Item interface represent food items such as burgers and cold drinks and conrete classes implementing the Item interface.
 * <p>
 * A Packing interface represent packagin of food items and concrete classes implementing the Packing interface as burger would be packed in wrapper and cold drink would be packed as bottle.
 * <p>
 * The Meal class have an ArrayList of Item and a MealBuilder to build different types of Meal object by combining Item.
 * <p>
 * BuilderPatternDemo class use MealBuilder to build a Meal.
 * Created by fouli on 2/1/2017.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {

        /**
         * Vegetarian Meal
         */
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println(" Total Cost: " + vegMeal.getCost());


        /**
         * Chicken Burger Meal
         */
        MealBuilder chickenBugerBuilder = new MealBuilder();
        Meal chickenBurgerMeal = chickenBugerBuilder.prepapreNonVegMeal();
        System.out.println("Chicken Burger Meal");
        chickenBurgerMeal.showItems();
        System.out.println(" Total Cost:" + chickenBurgerMeal.getCost());

    }

}

