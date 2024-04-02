import java.util.*;
class square {
	
	static double sqr(double number,int power){
		double output=0;
		output=number*number;
		
		if(power>2){
		for(int i=1;i<=power-2;i++){
			output=output*number;
			 //System.out.println(output);
			}
		}
		return output;
		}
		
	public static void main(String args[]){
	 Scanner in =new Scanner(System.in);
		 System.out.println("enter a number");
		 double number = in.nextDouble();
		 System.out.println("enter a power");
		 int  power = in.nextInt();
 		
 		 System.out.println(sqr(number,power));
		}
	}
