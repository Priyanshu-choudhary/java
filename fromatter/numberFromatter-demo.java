// Java Program to illustrate NumberFormat class use

import java.text.*;
import java.util.*;

class NumberFormatDemo {
	public static void main(String[] args)
	{
		double d = 123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("ITALY representation of " + d + " : " + nf.format(d));
		
		nf = NumberFormat.getInstance(Locale.US);
		System.out.println("ITALY representation of " + d + " : " + nf.format(d));
		
		nf = NumberFormat.getInstance(Locale.India);
		System.out.println("ITALY representation of " + d + " : " + nf.format(d));
		
}
}
