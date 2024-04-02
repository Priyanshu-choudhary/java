import java.util.*;
class fiboncci {
	static double CalFiboncci(int number){
		double goldenRatio=1.6180;
		if(number ==1){return 1;}
		if(number ==0){return 0;}	
		
		double output = (sqr(goldenRatio,number)-(sqr(1-goldenRatio,number)))/2.23606;

		return roundOffNumber(output);
		
		}
	static double sqr(double number,int power){
		double output=0;
		output=number*number;
		
		if(power>2){
		for(int i=1;i<=power-2;i++){
			output=output*number;
			
			}
		}
		return output;
		}
		
	static double roundOffNumber(double number){
		int tem =(int)number;
		
		if((tem+1-number)<0.1){
			number=(double)tem+1;
			}
		return number;
		}
				
	public static void main(String args[]){
		 Scanner in =new Scanner(System.in);
		 while(true){
			 System.out.println("enter a number");
			 int number = in.nextInt();
			 System.out.println(CalFiboncci(number));
			}
		}
	}
