import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc=new Scanner(System.in);
     String A=sc.next();
	 int lc=0;
	 if(A.length()%2==0){lc=A.length()/2;}
	 else{lc=A.length()-1/2;}
	
	 for(int i=0;i<lc;i++){
		if(A.charAt(i)==A.charAt(A.length()-i)){
			System.out.printf("  T ");
		}else{
			System.out.printf("  F ");	
			}
	}
}
