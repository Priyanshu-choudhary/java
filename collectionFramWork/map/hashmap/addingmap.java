// Java program add the elements in the SortedMap
import java.io.*;
import java.util.*;
class GFG {

	// Main Method
	public static void main(String args[])
	{
		// Default Initialization of a
		// SortedMap
		// Initialization of a SortedMap
		// using Generics
		SortedMap<Integer, String> tm2
			= new TreeMap<Integer, String>();

		// Inserting the Elements
		tm2.put(1, "Geeks");
		tm2.put(2, "For");
		tm2.put(3, "Geeks");


		System.out.println(tm2);
	}
}
