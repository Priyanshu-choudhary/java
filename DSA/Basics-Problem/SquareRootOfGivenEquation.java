import java.util.Scanner;
import java.math.*;
class SquareRootOfGivenEquation {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    //ax^2+bx+c
    //d=b^2-4ac
    float d=b*b-(4*a*c);
    //x=-b+-(D)/2a
    float x1=(float)((-b)-Math.sqrt(d))/(2*a);
    float x2=(float)((-b)+Math.sqrt(d))/(2*a);
    System.out.println("1st root "+x1);
    System.out.println("2st root "+x2);
    
    
}    
}
