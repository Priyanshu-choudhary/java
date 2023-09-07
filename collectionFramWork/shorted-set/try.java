import java.util.*;
 class Demo
{
	public static void main(String[] args){

	for(int i=0;i<args.length;i++){
	System.out.print(args[i].charAt(0));
	System.out.print(".");
}
	String fname =args[0];
	String lname =args[args.length-1];
	//System.out.println(args.length);
	System.out.print(fname.charAt(0));
	System.out.print(lname);

	}
}
