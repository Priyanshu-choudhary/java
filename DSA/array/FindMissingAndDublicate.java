/**
 * FindMissingAndDublicate
 */
import java.util.*;
public class FindMissingAndDublicate {

    public static void main(String[] args) {
        int[]arr={3,1,2,5,3};
        int max=arr[0],min=arr[0],missElement=0;
        boolean flag=true;
        Map<Integer,Integer>mp=new HashMap<>();
        for (int i : arr) {
            mp.put(i,mp.getOrDefault(i,0)+1);
            if(i>max){
                max=i;
            }if(i<min){
                min=i;
            }
            if(mp.containsValue(2)&&flag==true){
                System.out.println("Dublicate "+i);
                flag=false;
            }
        }
        for(int i=min;i<=max;i++){

            if(!mp.containsKey(i)){
                missElement=i;
            }
        }
        
        if (missElement==0) {
            missElement=max+1;
        }
        
        System.out.println("missing "+missElement);
        System.out.println(mp);
    }
}