import java.io.File; 
import java.io.IOException;
import java.io.FileWriter; 

class CreateFile {  
  public static void main(String[] args) {  
    double a=12.6;
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
      myWriter.write("volt:"+a);
      myWriter.close();
 	}
     
     System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }  
} 
