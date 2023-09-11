import java.util.Scanner;

class Solution {

public static void main(String args[]){ 
        String smallest = "";
        String largest = "";
        String s="welcometojava";
		int k=3;
		int rg=1;
		int small=1;
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<=s.length()-k;i++){
            String sub= s.substring(i,i+k);
            System.out.println(sub);
            
            for(int j=0;j<=s.length()-k-1;j++){
                String subn=s.substring(j+1,j+k+1);
                System.out.print("subn "+subn);
				
            	System.out.println("   check  "+sub.compareTo(subn));
				if(sub.compareTo(subn)<0){
					small=0;
				}
				if(sub.compareTo(subn)<0){
					rg=0;
				}
			}
			if(rg==1){System.out.println("  greatest=   "+sub);}	
			if(small==0){System.out.println("  smallest=   "+sub);}
        }
        
 
  }
}
