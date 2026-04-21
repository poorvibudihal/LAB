package likedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorDemo {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        System.out.println("Full List: " + list);

        // Start iterator from 2nd position (index 1)
        ListIterator<String> iterator = list.listIterator(1);

        System.out.println("Elements from 2nd position:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
