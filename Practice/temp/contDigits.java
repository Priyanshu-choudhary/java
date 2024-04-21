import java.util.*;
class Solution {
    public int countDigits(int num) {
        HashSet<Integer> hs = new HashSet<>();
		
	    int numcopy=num; 
       int cnt=0;
        while(num!=0){
            int rem=num%10;
            hs.add(rem); 
            num/=10;
        }
        // Traversing elements
		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
           // System.out.println(itr.next());
           try {
            if(numcopy%(itr.next())==0){
                cnt++;
              } 
           } catch (Exception e) {
            // TODO: handle exception
           }
		}
        return cnt;
    }
}

 public class contDigits {
public static void main(String[] args) {
    Solution sc =new Solution();
    System.out.println(sc.countDigits(54));
}
    
}