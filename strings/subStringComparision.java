import java.util.*;

class Solution {

public static void main(String args[]){ 
         NavigableSet<String> ns = new TreeSet<>();       

		String smallest = "";
        String largest = "";
        String s="welcometojava";
		String sub="";
		int k=3;
		int rg=1;
		int small=1;
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<=s.length()-k;i++){
            sub= s.substring(i,i+k);
            //System.out.println(sub);
            ns.add(sub);
          /*  for(int j=0;j<=s.length()-k-1;j++){
                String subn=s.substring(j+1,j+k+1);
                //System.out.print("subn "+subn);
				      
            	//System.out.println("   check  "+sub.compareTo(subn));
				if(sub.compareTo(subn)>0){
					small=0;
				}else{}
				if(sub.compareTo(subn)<0){
					rg=0;
				}else{}
			}
			if(rg==1){System.out.println("  greatest=   "+sub);}	
			if(small==1){System.out.println("  smallest=   "+sub);}
        	//System.out.println("small "+small+" greatest "+rg);
			rg=1;
			small=1;
		

*/
		}
        System.out.println(ns);
 		System.out.println(ns.pollLast());
		System.out.println(ns.pollFirst());
  }
}
