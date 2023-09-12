import java.util.*;
class Simple{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is khan");  
   String s="Hello everyone I am a Java developer";
   StringTokenizer st2= new StringTokenizer(s);  
	while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }
	//System.out.println("Total number of Tokens: "+st.countTokens());  
	 while (st2.hasMoreTokens()) {
         System.out.println(st2.nextToken());       
	    }   
	//System.out.println("Total number of Tokens: "+st2.countTokens());
   }  
} 
