import java.util.*;
class NewtonRaphsonSquareMethod {
	static double sqr(double n){
		double g=n/2;
		double t=0.00001;
		while(g*g-n>t){
			g=(g+n/g)/2;
			}
		return g; 	
		}
	public static void main(String args[]){
		 Scanner in =new Scanner(System.in);
		 System.out.println("enter a number");
		 double number = in.nextDouble();
 		
 		System.out.println(sqr(number));
		}
	}
