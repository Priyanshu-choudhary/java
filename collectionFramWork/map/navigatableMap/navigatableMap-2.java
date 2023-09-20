// Java program to demonstrate
// the NavigableMap interface
import java.util.NavigableMap;
import java.util.TreeMap;
 class NavigableMapExample {

	public static void main(String[] args)
	{
		// Instantiate an object
		// Since NavigableMap
		// is an interface so we
		// use TreeMap
		NavigableMap<Integer,Double> nm
			= new TreeMap<Integer,Double>();

		// Add elements using put() method
		nm.put(1,2.44);
		nm.put(2,3.44);
		nm.put(3,.4);
		nm.put(4,0.0);
		nm.put(5,93.2);
		nm.put(6,2.44);

		// Print the contents on the console
		System.out.println("Mappings of NavigableMap : "
						+ nm);

		System.out.printf("Descending Set : %s%n",
						nm.descendingKeySet());
			}
}
