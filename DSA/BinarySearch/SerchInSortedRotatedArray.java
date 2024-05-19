/*
 * Step 1. find mid is mid ans then ans otherwise  check if mid(right,left) part is sorted
 * step 2. if sorted then check is element is prestent in si to en (right,left)part
 */
import java.util.*;

 public class SerchInSortedRotatedArray{
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int si = 0, en = n - 1;
        while (si <= en) {
            int mid = (si + en) / 2;
            System.out.println(si+" "+mid+" "+en+" --"+arr.get(mid));
            // if mid points to the target
            if (arr.get(mid) == k)
                return mid;

            // if left part is sorted
            if (arr.get(si) <= arr.get(mid)) {
                System.out.println("left");
                if (arr.get(si) <= k && k <= arr.get(mid)) {
                    // element exists
                    System.out.println("left if");
                    en = mid - 1;
                } else {
                    // element does not exist
                    si = mid + 1;
                }
            } else { // if right part is sorted
                System.out.println("Right");
                if (arr.get(mid) <= k && k <= arr.get(en)) {
                    // element exist
                    System.out.println("Right if"+mid);
                    si = mid + 1;
                } else {
                    // element does not exist
                    en = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int  k = 3;
        int ans = search(arr, arr.size()-1, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}
