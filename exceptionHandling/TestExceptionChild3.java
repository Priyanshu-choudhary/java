import java.io.*;    
class Parent{    
  void msg() throws Exception {  
    System.out.println("parent method");  
  }    
}    
    
public class TestExceptionChild3 extends Parent {    
  void msg()throws Exception {  
    System.out.println("child method");  
  }    
    
  public static void main(String args[]){    
   Parent p = new TestExceptionChild3();    
     
   try {    
   p.msg();    
   }  
   catch(Exception e) {}    
  }    
}   
