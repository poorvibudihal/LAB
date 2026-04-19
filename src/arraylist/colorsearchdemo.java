package arraylist;
import java.util.ArrayList;
import java.util.List;
public class colorsearchdemo {
	


	    public static void main(String[] args) {

	        // Using List interface with ArrayList
	        List<String> colors = new ArrayList<>();

	        // Adding different colors
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Black");

	        // Display colors
	        System.out.println("Colors: " + colors);

	        // Search for "Red"
	        if (colors.contains("Red")) {
	            System.out.println("Color \"Red\" is available in the list.");
	        } else {
	            System.out.println("Color \"Red\" is NOT available in the list.");
	        }
	    }
	}


