package likedlist;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListDemo {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        System.out.println("Original List: " + list);

        // Reverse iteration using descendingIterator()
        Iterator<String> iterator = list.descendingIterator();

        System.out.println("Reverse Order:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}