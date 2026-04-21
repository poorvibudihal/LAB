package arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteNthElementDemo {

    public static void main(String[] args) {

        // Using List interface with ArrayList
        List<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Original List: " + colors);

        // Taking input for n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position (n) to delete: ");
        int n = sc.nextInt();

        // Remove nth element (user enters 1-based index)
        if (n >= 1 && n <= colors.size()) {
            colors.remove(n - 1);  // convert to 0-based index
            System.out.println("After deleting " + n + "th element: " + colors);
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}