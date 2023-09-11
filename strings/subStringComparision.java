import java.util.Scanner;

public class Solution {

static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String s="welcometojava";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<=s.length()-k+1;i++){
            String sub= s.substring(i,i+k);
            System.out.println(sub);
            
            for(int j=0;j<=s.length()-k+1;j++){
                String subn=s.substring(j+1,j+k+1);
                System.out.println("subn "+subn);
            }
        }
        
 
    }
