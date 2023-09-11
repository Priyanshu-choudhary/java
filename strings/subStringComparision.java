import java.io.*;
import java.util.*;
public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
         NavigableSet<String> ns = new TreeSet<>();
        
         for(int i=0;i<=s.length()-k;i++){
              String sub= s.substring(i,i+k);
               ns.add(sub);
            }
             String largest = ns.pollLast(); 
             String smallest = ns.pollFirst();  
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
