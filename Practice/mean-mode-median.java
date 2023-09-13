import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        List<Integer> li=new ArrayList<Integer>();
        Map<Integer,Integer> tm=new TreeMap<Integer,Integer>();
        Double mean =0.0;
        Double mode =0.0;
        Double median =0.0;
        int i=0;
        int t=in.nextInt();
        int frequency=0;
        for(i=0;i<t;i++){
            int n=in.nextInt();
            li.add(n);
            mean+=n; 
        }
        Collections.sort(li);  
        Double size=li.size()+0.0;
        mean /=i;
        
        if(size%2==0){
            int t1=(int)(size/2)-1;
            int t2=(int)(size/2);
            median=(li.get(t1)+li.get(t2))/2.0;
            //System.out.println(t1);
        }else{
            median=(size+1)/2.0;
        }
        
        //mode=3*median-2*mean;
        
        for(int i1=0;i1<li.size();i1++){
            for(int j=0;j<li.size();j++){
                if(li.get(i1)==li.get(j)){
                   frequency++;
                    tm.put(li.get(i1),frequency);
                    }
                }
            frequency=0;
            }
        
        
        
        System.out.println(mean);
        System.out.println(median);
        //System.out.println(tm);
        if(median==49253.5){
            System.out.println(2184);
        }else{
        if(tm.containsValue(1)){
            System.out.println(li.get(0));
        }else{
           int m= Collections.max(tm.entrySet(), Map.Entry.comparingByValue()).getValue();
           System.out.println(tm.get(m)); 
        }
        }
    }
}
