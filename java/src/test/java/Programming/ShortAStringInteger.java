package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ShortAStringInteger {
	
	public static void main(String[] args) {
		

		
		       /* String[] numbers = {"1", "2", "3", "4", "9", "3"};

		        // Sorting in ascending order
		        Arrays.sort(numbers, Comparator.comparingInt(Integer::parseInt));

		        // Printing the sorted array
		        System.out.println("Sorted in ascending order: " + Arrays.toString(numbers));
		    }*/
		
	 // Create a list of strings
    List<String> stringList = new ArrayList<>();
    stringList.add("1");
    stringList.add("2");
    stringList.add("3");
    stringList.add("4");
    stringList.add("9");
    stringList.add("3");

    // Sort the list in ascending order
    Collections.sort(stringList);

    // Print the sorted list
    System.out.println("Sorted List in Ascending Order: " + stringList);
}
}
	
