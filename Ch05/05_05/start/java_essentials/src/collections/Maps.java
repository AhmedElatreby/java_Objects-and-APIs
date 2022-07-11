package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);

        System.out.println(fruitCalories);
        // to overrides existing value you can use put
       // fruitCalories.put("apple", 100);
        fruitCalories.putIfAbsent("apple", 100); // this will update the value if is not existed
        System.out.println(fruitCalories);

        // you can access the value of the item by .get method
        System.out.println("lemon: " + fruitCalories.get("lemon") + " calories");

        // to remove an item from the mep we use remove
        fruitCalories.remove("lemon");
        System.out.println(fruitCalories);

        // you can make the map immutable by using Map.of
        Map moreFruits = Map.of(
                "apple", 100,
                "lemon", 20
        );
        System.out.println(moreFruits);
       // moreFruits.remove("apple"); // you cannot remove from immutable map


    }
}
