// Java program to demonstrate the
// working of a stack
import java.util.*;
 class GFG {

	// Main Method
	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>();
		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");
		stack.push("Geeks");
		stack.add("add1");
		stack.add("add2");
		stack.push("add3");
		stack.push("add4");

		// Iterator for the stack
		Iterator<String> itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		stack.pop();

		// Iterator for the stack
		itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
