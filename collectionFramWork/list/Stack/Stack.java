// Java program to demonstrate the
// working of a stack
import java.util.*;
class test {

	// Main Method
	public static void main(String args[])
	{
		Stack<String> s = new Stack<String>();
		s.push("Geeks");
		s.push("For");
		s.push("Geeks");
		s.push("Geeks");

		// Iterator for the stack
		Iterator<String> itr = s.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		s.pop();

		// Iterator for the stack
		itr = s.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
