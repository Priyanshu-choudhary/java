// Java Program to demonstrate replacing
// elements of AbstractMap

import java.util.AbstractMap;
import java.util.HashMap;

class ReplaceElements {

	public static void main(String[] args)
	{

		// Since AbstractMap is an abstract class
		// create object using HashMap
		AbstractMap<String, String> absMap
			= new HashMap<String, String>();

		// Adding values to the AbstractMap
		// Note that we do not create an object of
		// AbstractMap
		absMap.put("a","This");
		absMap.put("b", "is");
		absMap.put("c", "a");
		absMap.put("d", "AbstractMap");

		// Displaying the mappings
		System.out.println("Mappings of the AbstractMap:");
		System.out.println(absMap);

		// Replacing the mapping associated to 3
		absMap.replace("c", "an");

		// Displaying the mappings
		System.out.println("\nMappings of the AbstractMap:");
		System.out.println(absMap);
	}
}
