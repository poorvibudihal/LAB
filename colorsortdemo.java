package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class colorsortdemo {
	

	

	    public static void main(String[] args) {

	        // Using List interface with ArrayList
	        List<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");

	        System.out.println("Before Sorting: " + colors);

	        // Sorting the ArrayList
	        Collections.sort(colors);

	        System.out.println("After Sorting: " + colors);
	    }
	}


