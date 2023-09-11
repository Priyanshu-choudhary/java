import java.util.*;

class Solution {

public static void main(String args[]){ 
         NavigableSet<String> ns = new TreeSet<>();       

        for(int i=0;i<=s.length()-k;i++){
        	String sub= s.substring(i,i+k);
            ns.add(sub);
		}
        
		String smallest = ns.pollFirst();
        String largest = ns.pollLast();
	
  }
}
