/*
 * Step 1. find mid is mid ans then ans otherwise  check if mid(right,left) part is sorted
 * step 2. if sorted then check is element is prestent in si to en (right,left)part
    -to check is it is  sorted in between si to mid condition(arr[si]<=arr[mid])
    -to check is it is exits in between si to mid(left part) condition(taget<=arr[mid] && target >= arr[mid]) if exists then (en =mid-1)
    -to check is it is exits in between mid to en(right part) condition(taget<=arr[en] && target >= arr[mid]) if exists then (si =mid+1)
 */
import java.util.*;

public class MinimumInRotatedSortedArray{
   public static int search(ArrayList<Integer> arr, int n, int k) {
       int si = 0, en = n - 1;
       int ans=arr.get(0);
       int min=arr.getFirst();
       while (si <= en) {
           int mid = (si + en) / 2;

           // if left part is sorted
           if (arr.get(si) <= arr.get(mid)) {
                  si = mid + 1;

              
           } else { // if right part is sorted
              
                  en = mid - 1;
                  
              
           }
           System.out.println(arr.get(si));
            ans = Math.min(ans, arr.get(si));
       }
       return ans;
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
