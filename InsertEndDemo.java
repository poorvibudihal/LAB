package likedlist;
import java.util.LinkedList;

public class InsertEndDemo {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> l_listobj = new LinkedList<>();

        // Add initial elements
        l_listobj.add("Red");
        l_listobj.add("Green");
        l_listobj.add("Blue");

        System.out.println("Before insertion: " + l_listobj);

        // Insert element at end
        l_listobj.offerLast("Pink");

        System.out.println("After insertion at end: " + l_listobj);
    }
}