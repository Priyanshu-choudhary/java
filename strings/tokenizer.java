import java.util.*;
class Simple{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is khan");  
   String s="Hello everyone I am a Java developer";
   StringTokenizer st2=s;  
	while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
	 while (st2.hasMoreTokens()) {
         System.out.println(st2.nextToken());       
	    }   
   }  
} 
