/*
 * Step 1. find mid is mid ans then ans otherwise  check if mid(right,left) part is sorted
 * step 2. if sorted then check is element is prestent in si to en (right,left)part
    -to check is it is  sorted in between si to mid condition(arr[si]<=arr[mid])
    -to check is it is exits in between si to mid(left part) condition(taget<=arr[mid] && target >= arr[mid]) if exists then (en =mid-1)
    -to check is it is exits in between mid to en(right part) condition(taget<=arr[en] && target >= arr[mid]) if exists then (si =mid+1)
 */

import java.util.*;

public class MinimumInSortedRotatedArray {
    public static int findMin(int[] arr) {
        // Write your code here.
        int low = 0, high = arr.length - 1, ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            /*
             * for next element than mid
             * arr[(mid + 1) % arr.length]);
             * 
             * for previous element than mid
             * arr[(mid + arr.length - 1) % arr.length]);
             */

            if (arr[(mid + arr.length - 1) % arr.length] > arr[mid] && arr[(mid + 1) % arr.length] > arr[mid]) {
                return arr[mid];
            }

            if (arr[mid] <= arr[high]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 1, 5, 6, 7 };
        int ans = findMin(arr);
        if (ans == -1)
        System.out.println("Target is not present.");
      
        else
            System.out.println("min: " + ans);
    }
}
