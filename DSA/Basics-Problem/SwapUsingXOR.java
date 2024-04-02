import java.util.*;
class SwapUsingXOR{
	
	
	public static void main(String args[]){
		int a=2,b=2;
		System.out.println(a+"             "+b);


		a	=a^b;
		b       =a^b;
 		a       =a^b;
		System.out.println(a+"             "+b);
		}
	}

