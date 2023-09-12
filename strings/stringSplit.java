import java.io.*;
import java.util.*;

public class Solution {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.
   if(s.trim().isEmpty()){
        System.out.print("0");

    }
    else{

     String[] s1=s.trim().split("[\\s!?,/._\'@]+");

System.out.println(s1.length);
for(String word:s1){
    System.out.println(word);
}
    scan.close();
}
} 
}

