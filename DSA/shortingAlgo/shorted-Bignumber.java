import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        NavigableSet<Double> ns = new TreeSet<Double>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
		    ns.add(Double.parseDouble(s));
        }
        NavigableSet<Double> reverseNs = ns.descendingSet();
        System.out.println("Normal order: " + reverseNs);
    }
}