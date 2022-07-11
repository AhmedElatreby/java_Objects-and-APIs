package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("apple"); // it can hold duplicate items

        System.out.println(fruits);

        var removed = fruits.remove(); // you can store removed item into variable. remove only remove the first item of the list
        System.out.println("removed item is: " + removed);

        // the first item in the queues is called the head.
        // you can view the head before remove it by using peek() method
        System.out.println("Head of the queue is: " + fruits.peek());

    }
}
