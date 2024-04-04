import java.util.*;
class countSubArrayXorK{

    static int getkey(int value,Map<Integer,Integer> mp){
        for (Map.Entry<Integer,Integer>entry:mp.entrySet()) {
            //entry.getKey()= number
            //entry.getValue()= frequency
            // System.out.println(entry.getKey()+"  v "+entry.getValue());
                    // /* 
            if(entry.getKey()==value){
                return entry.getValue();
            }
    
         }
        return 0;
    }
    

    public static void main(String[] args) {
        int [] arr={5,6,7,8,9};
        Map<Integer,Integer> mp=new HashMap<>();
        int target =6,count=0;
        mp.put(arr[0],1);
        mp.put(0,1);
                                
        for (int i = 0; i < arr.length; i++) {
            try{arr[i]=arr[i-1]^arr[i];
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            if(mp.get(arr[i]^target)>0){
                    count+=mp.get(arr[i]^target);
            }
            
            }catch(Exception e){}
        }
    
        System.out.println("count  "+count);
    }
}