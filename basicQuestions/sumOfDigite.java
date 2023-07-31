import java.util.*;
class SumOfDigite{
	int digit=0;
	int reminder=0;
	int counter=0;
	public int numberofdigit(int d){
	    int i=0;
			
		while(d!=0){
		d=d/10;
			i++;
		}		
		return i;
	}	
	public int sumofdigit(int d){
		int a=0;
	    int i=0;
		int sum=0;	
		while(d!=0){
		a= d%10;
		d=d/10;
			i++;
		sum=sum+a;
		
		}
		return sum;
	}
	
	public static void main(String[] args){
		
	SumOfDigite dg=new SumOfDigite();
	Scanner in = new Scanner(System.in);
		System.out.println("enter digit:");
		dg.digit= in.nextInt();
		System.out.println("number of digit:"+dg.numberofdigit(dg.digit));
		System.out.println("sum of digit:"+dg.sumofdigit(dg.digit));
	}

}