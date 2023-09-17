import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class array2d{
public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    List<List<Integer>> arr = new ArrayList<>();
    System.out.println("Enter Row and collum");
    int raw=in.nextInt();
    int Col=in.nextInt();
    for (int i = 0; i < raw; i++) {
        List<Integer> arrRowItems = new ArrayList<>(); //Declair it inside loop so its value get restart in every loop

        for (int j = 0; j < Col; j++) {
            int a=in.nextInt();
            arrRowItems.add(a);
        }
        System.out.println("next row...");
        arr.add(arrRowItems);
    }

   in.close();
    
    System.out.println(arr);
 }
}

