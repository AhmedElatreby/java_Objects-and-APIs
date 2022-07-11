package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachWithLambdas {

    public static void main(String[] args) {
        printCollection_forEach();
        printMap_forEach();
    }

    public static void printCollection_forEach(){
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.forEach(f -> System.out.println(f)); // using Lambda Expression

        System.out.println("--------------------------------------");

        fruits.forEach(System.out::println);// using simple Lambda Expression

        System.out.println("--------------------------------------");


        // add a statement into forEach loop
        fruits.forEach(f -> {
            f = "Fruits: " + f;
            System.out.println(f);
        });
        System.out.println("--------------------------------------");

    }

    public static void printMap_forEach(){
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        // using forEach loop with map
        fruitCalories.forEach((k,v) -> System.out.println(k + " : " + v));
    }


}