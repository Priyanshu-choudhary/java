import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two string");
        
		String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println("length sum"+A.length()+B.length());
        if(A.compareTo(B)<=0){
            System.out.println("first string come first in dictonary");
        }else{
            System.out.println("secound string come first in dictonary");
        }
        String s=A.substring(0,1).toUpperCase();
        String s1=A.substring(1);
        String sr=s;
        sr=sr.concat(s1);
        System.out.print(sr+" ");
        
         s=B.substring(0,1).toUpperCase();
         s1=B.substring(1);
         sr=s;
        sr=sr.concat(s1);
        System.out.print(sr);
        
    }
}



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)<=0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        String s=A.substring(0,1).toUpperCase();
        String s1=A.substring(1);
        String sr=s;
        sr=sr.concat(s1);
        System.out.print(sr+" ");
        
         s=B.substring(0,1).toUpperCase();
         s1=B.substring(1);
         sr=s;
        sr=sr.concat(s1);
        System.out.print(sr);
        
    }
}



