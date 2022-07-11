package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("Orange");

        System.out.println(fruits);
        System.out.println("Have an apple? " + fruits.contains("apple"));

        fruits.remove("lemon");
        System.out.println("Number of elements after removing lemon: " + fruits.size());

        // use set.of to add to the Set.Of, but you cannot add or remove like using HashSet

        Set moreFruits = Set.of("pear", "raisin", "cherry");
       // moreFruits.add("some fruits");
       // moreFruits.remove("some fruits");
        System.out.println(moreFruits);

    }
}
