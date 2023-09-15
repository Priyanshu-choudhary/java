// Java Program Demonstrating Working of matches() Method
// Pattern class

// Importing Pattern class from java.util.regex package
import java.util.regex.Pattern;

// Main class
class GFG {

	// Main driver method
	public static void main(String args[])
	{
		System.out.println(Pattern.matches("geeksforge*ks", "geeksforgeeks"));
		System.out.println(Pattern.matches("g*geeks*", "geeksfor"));
	}
}
