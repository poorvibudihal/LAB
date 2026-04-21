package arraylist;

import java.util.*;

public class listoperation {

    public static void main(String[] args) {

        // Create ArrayList and LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("=== 1. Adding elements ===");
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 2. Add at specific index
        System.out.println("\n=== 2. Add at specific index ===");
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        System.out.println(arrayList);
        System.out.println(linkedList);

        // 3. Add multiple elements
        System.out.println("\n=== 3. Add multiple elements ===");
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        System.out.println(arrayList);
        System.out.println(linkedList);

        // 4. Access elements
        System.out.println("\n=== 4. Accessing elements ===");
        System.out.println("ArrayList first element: " + arrayList.get(0));
        System.out.println("LinkedList first element: " + linkedList.get(0));

        // 5. Update elements
        System.out.println("\n=== 5. Updating elements ===");
        arrayList.set(1, "Kiwi");
        linkedList.set(1, "Kiwi");

        System.out.println(arrayList);
        System.out.println(linkedList);

        // 6. Remove elements
        System.out.println("\n=== 6. Removing elements ===");
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        System.out.println(arrayList);
        System.out.println(linkedList);

        // 7. Search elements
        System.out.println("\n=== 7. Searching elements ===");
        System.out.println("Contains Apple: " + arrayList.contains("Apple"));
        System.out.println("Index of Orange: " + arrayList.indexOf("Orange"));

        // 8. List size
        System.out.println("\n=== 8. List size ===");
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over list
        System.out.println("\n=== 9. Iterating (for-each) ===");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // 10. Using Iterator
        System.out.println("\n=== 10. Using Iterator ===");
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 11. Sorting
        System.out.println("\n=== 11. Sorting ===");
        Collections.sort(arrayList);
        Collections.sort(linkedList);

        System.out.println(arrayList);
        System.out.println(linkedList);

        // 12. Sublist
        System.out.println("\n=== 12. Sublist ===");
        System.out.println("Sublist (0-2): " + arrayList.subList(0, 2));

        // 13. Clearing list
        System.out.println("\n=== 13. Clearing list ===");
        arrayList.clear();
        linkedList.clear();

        System.out.println("ArrayList after clear: " + arrayList);
        System.out.println("LinkedList after clear: " + linkedList);
    }
}