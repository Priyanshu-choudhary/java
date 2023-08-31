// Java program to demonstrate the working of
// priority queue in Java
import java.util.*;

class GfG {

	// Main Method
	public static void main(String args[])
	{
		// Creating empty priority queue
	PriorityQueue<Integer> pQueue
			= new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(3);
		pQueue.add(2);
		pQueue.add(1);
		pQueue.add(4);
		pQueue.add(6);
		pQueue.add(5);
		pQueue.add(9);
		pQueue.add(8);
		pQueue.add(7);
		System.out.println(pQueue);
		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());
        	
	for(int i:pQueue){
	//System.out.println(pQueue.elementAt[i]);
	//	System.out.println(pQueue.get[i]);
	}
}
}
