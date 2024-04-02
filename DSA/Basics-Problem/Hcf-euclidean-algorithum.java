import java.util.*;
class hcf{

public static void main (String args[]){
	
	 Scanner in =new Scanner(System.in);
	 System.out.printf("enter hcf numbers");
	 int a = in.nextInt();
	 int b = in.nextInt();
	System.out.print("HCF of"+a+","+b+"=	");
	if(b>a){
	int temp=b;
	b=a;
	a=temp;
	}//a=32,b=12;

	if(a%b==0){
	System.out.println(b);
	}else{
		while(a%b != 0){
		int temp=a;
		a=b;
		b=temp%b;
		}
	System.out.println(b);
	}
  }
}
