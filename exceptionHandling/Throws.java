import java.io.*;  
public class Throws {
    void printArray(int[] arr) throws Exception{
        for (int i = -1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }   
    public static void main(String args[]){  
        Throws obj =new Throws();
        int [] arr={1,2,3,4,5,6,7,8,9};
        try{
        obj.printArray(arr);
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.println("rest of the code...");    
  }    
}    
