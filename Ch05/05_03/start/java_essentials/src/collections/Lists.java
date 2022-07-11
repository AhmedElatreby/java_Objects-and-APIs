package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println(fruits);

        // you can use get to call the place of the item in the array
        System.out.println(fruits.get(3));

        // you can replace the item in the array by using set
        fruits.set(3, "cherry");
        fruits.add("lemon"); // you can add duplicate items

        System.out.println(fruits);

        // you can get the index of the item in the array
        System.out.println(" index of first lemon: " + fruits.indexOf("lemon"));
        System.out.println(" index of last lemon: " + fruits.lastIndexOf("lemon"));

        // to remove from the array you can use remove
        fruits.remove(4);
        System.out.println(fruits);
    }
}