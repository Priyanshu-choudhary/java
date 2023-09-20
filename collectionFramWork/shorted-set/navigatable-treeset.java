// Java program to demonstrate
// the working of NavigableSet
import java.util.NavigableSet;
import java.util.TreeSet;

 class NavigableSetDemo
{
	public static void main(String[] args)
	{
		NavigableSet<Double> ns = new TreeSet<Double>();
		ns.add(0.0);
		ns.add(1.2);
		ns.add(0.2);
		ns.add(324.42);
		ns.add(424.2);
		ns.add(5.34);
		ns.add(0.426);

		// Get a reverse view of the navigable set
		NavigableSet<Double> reverseNs = ns.descendingSet();

		// Print the normal and reverse views
		System.out.println("Normal order: " + ns);
		System.out.println("Reverse order: " + reverseNs);
/* 
		NavigableSet<Double> threeOrMore = ns.tailSet(3, true);
		System.out.println("3 or more: " + threeOrMore);
		System.out.println("lower(3): " + ns.lower(3));
		System.out.println("floor(3): " + ns.floor(3));
		System.out.println("higher(3): " + ns.higher(3));
		System.out.println("ceiling(3): " + ns.ceiling(3));

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);

		System.out.println("pollLast(): " + ns.pollLast());
		System.out.println("Navigable Set: " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("pollLast(): " + ns.pollLast());
	*/
	}
}
