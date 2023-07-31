import java.util.*;
class calculator{
	
	public int sum(int a,int b){
	return a+b;
	} 
	
	public int multiply(int a,int b){
	return a*b;
	}
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	calculator suming=new calculator();
		while(true){
			System.out.println("enter two number for sum");
			int a= in.nextInt();
			int b= in.nextInt();
			int c= suming.sum(a,b);
			int d= suming.multiply(a,b);
			System.out.println("s: " +c+ " m: "+d);
		}
	}
}