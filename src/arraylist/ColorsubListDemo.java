package arraylist;
import java.util.ArrayList;
import java.util.List;

public class ColorsubListDemo {

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

        // Extract 1st and 2nd elements (index 0 to 2, 2 is exclusive)
        List<String> sub = colors.subList(0, 2);

        System.out.println("Extracted (1st & 2nd elements): " + sub);
    }
}
