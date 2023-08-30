// Java Program to demonstrate usage of BlockingQueue

import java.util.concurrent.*;
import java.util.*;

class GFG {

	public static void main(String[] args)
		throws InterruptedException
	{

		// define capacity of ArrayBlockingQueue
		int capacity = 5;

		// create object of ArrayBlockingQueue
		BlockingQueue<String> queue
			= new ArrayBlockingQueue<String>();

		// Add elements to ArrayBlockingQueue using put
		// method
		queue.add("StarWars");
		queue.add("SuperMan");
		queue.add("Flash");
		queue.add("BatMan");
		queue.add("Avengers");

		// print Queue
		System.out.println("queue contains " + queue);

		// remove some elements
		queue.remove();
		queue.remove();

		// Add elements to ArrayBlockingQueue
		// using put method
		queue.put("CaptainAmerica");
		queue.put("Thor");

		System.out.println("queue contains " + queue);
	}
}
