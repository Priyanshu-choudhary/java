/*
 * Step 1. find mid is mid ans then ans otherwise  check if mid(right,left) part is sorted
 * step 2. if sorted then check is element is prestent in si to en (right,left)part
    -to check is it is  sorted in between si to mid condition(arr[si]<=arr[mid])
    -to check is it is exits in between si to mid(left part) condition(taget<=arr[mid] && target >= arr[mid]) if exists then (en =mid-1)
    -to check is it is exits in between mid to en(right part) condition(taget<=arr[en] && target >= arr[mid]) if exists then (si =mid+1)
 */
import java.util.*;
public class MinimumI {
    public static int findMin(int []arr) {
        // Write your code here.
        int low=0,high=arr.length-1,ans=0;
      
       while(low<=high){
       //   for(int i=0;i<5;i++){
              int mid=(low+high)/2;
            
            try{
                 // System.out.println(arr[mid]);
              if(arr[mid-1]>arr[mid]&&arr[mid+1]>arr[mid]){
                //  System.out.println("woooooo"+arr[mid]);
                
                  return arr[mid];
              }
            }catch(Exception e)
            {  if(arr[0]<arr[arr.length-1]){
                return arr[0];
            }else{
                return arr[arr.length-1];
            }
            }
              if (arr[mid]<=arr[high]) {
                  
                  high=mid-1;
              }else{
                  low=mid+1;
              }
        }
        return -1;
    }
}

   public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 1, 2, 3, 4, 5, 6));
       int n = 9, k = 4;
       int ans = search(arr, n, k);
       if (ans == -1)
           System.out.println("Target is not present.");
       else
           System.out.println("The index is: " + ans);
   }
}
