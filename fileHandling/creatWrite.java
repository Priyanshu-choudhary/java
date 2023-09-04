import java.io.*;
import java.util.*;

class CreateFile {  
  public static void main(String[] args) {  
    double a=12.6;

      //Date todaydate = new Date();
      //System.out.println(todaydate.toString());



   try {  
      File myObj = new File("test.txt");  
      if (myObj.createNewFile()) {  
        System.out.println("File created: " + myObj.getName());  
      } else {  
        System.out.println("File already exists.");  
      }  
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();  
    }


   try {
      
      for(int i=0;i<10;i++){
      FileWriter myWriter = new FileWriter("test.txt");
      Date todaydate = new Date();
      myWriter.write("volt:"+a+"  "+todaydate.toString());
      myWriter.close();
      try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}
 	}
     
     System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }  
} 
