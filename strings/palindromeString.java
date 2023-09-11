import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc=new Scanner(System.in);
     String A=sc.next();
	 int lc=0;
	 int res=1;
	 if(A.length()%2==0){lc=A.length()/2;}
	 else{lc=(A.length()-1)/2;}
	// System.out.println(lc);
	 
	for(int i=0;i<lc;i++){
		if(A.charAt(i)==A.charAt(A.length()-i-1)){
		}else{
			res=0;	
			}
		}if(res==0){
			System.out.print("NO");
			}else{
				System.out.print("YES");
				}
	}
	
}
