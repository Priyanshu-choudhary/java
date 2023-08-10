public class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      int data=100/0;  
   }catch(ArithmeticException e){System.out.println(e);}  
  try {String s=null;  
	System.out.println(s.length());}catch(NullPointerException e){System.out.println(e);}
   System.out.println("rest of the code...");  
  }  
}  
