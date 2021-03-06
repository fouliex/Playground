package designPatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * The Meal class creates Item objects
 * Created by fouli on 2/1/2017.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost =0.0f;

        for(Item item: items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items){
            System.out.print("Item : " + item.name());
            System.out.print(",Packing : " + item.packing().pack());
            System.out.print(", Price:  " + item.price());
        }
    }
}

