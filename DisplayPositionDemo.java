package likedlist;

import java.util.LinkedList;

public class DisplayPositionDemo {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> l_listobj = new LinkedList<>();

        // Add elements
        l_listobj.add("Apple");
        l_listobj.add("Banana");
        l_listobj.add("Orange");
        l_listobj.add("Mango");
        l_listobj.add("Grapes");

        System.out.println("Elements and their positions:");

        // Display using get(p)
        for (int p = 0; p < l_listobj.size(); p++) {
            System.out.println("Position " + p + " : " + l_listobj.get(p));
        }
    }
}