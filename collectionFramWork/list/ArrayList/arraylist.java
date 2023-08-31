// Java program to demonstrate the
// working of ArrayList
import java.io.*;
import java.util.*;

class arraylist {

	// Main Method
	public static void main(String[] args)
	{

		// Declaring the ArrayList with
		// initial size n
		List<Integer> al = new ArrayList<Integer>();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			al.add(i);

		// Printing elements
		System.out.println(al);

		// Remove element at index 3
		al.remove(3);

		// Displaying the ArrayList
		// after deletion
		System.out.println(al);
		System.out.println("get "+al.get(0));

		// Printing elements one by one
		for (int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + " ");
	}
}
