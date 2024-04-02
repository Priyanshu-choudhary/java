import java.util.*;
class fiboncci {
	public static void main(String args[]){
	 Scanner in =new Scanner(System.in);
	 System.out.println("enter a number");
	 double number = in.nextDouble();
	
		int tem =(int)number;
		
		if((tem+1-number)<0.5){
			number=(double)tem+1;
			}
		
		//System.out.println(tem);
		System.out.println(number);
		
		}
	}
