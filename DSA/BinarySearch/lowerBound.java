import java.util.*;

public class lowerBound {

    public static int lowerBound(int []arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
          
            int mid = (low + high) / 2;
          System.out.println(mid);
            // maybe an answer
            if (arr[mid]<x) {
                low=mid+1;
            }else{
                high=mid-1;
               
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int n = 4, x = 2;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
} 
