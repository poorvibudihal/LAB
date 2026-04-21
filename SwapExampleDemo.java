package likedlist;

import java.util.LinkedList;
import java.util.Collections;

public class SwapExampleDemo {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> l_list = new LinkedList<>();

        // Add elements
        l_list.add("Apple");
        l_list.add("Banana");
        l_list.add("Orange");
        l_list.add("Mango");

        System.out.println("Before swapping: " + l_list);

        // Swap first (index 0) and third (index 2)
        Collections.swap(l_list, 0, 2);

        System.out.println("After swapping first and third: " + l_list);
    }
}
