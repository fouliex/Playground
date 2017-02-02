package designPatterns.creational.builder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fouli on 2/1/2017.
 */
public class BuilderPatternTest {


    @Test
    public void createVegetarianMeal() {
        //Given a meal builder
        MealBuilder mealBuilder = new MealBuilder();
        //When I build a vegetarian meal
        Meal vegMeal = mealBuilder.prepareVegMeal();
        //Then I should have total cost of
        assertEquals("75.5", String.valueOf(vegMeal.getCost()));
    }


}