
import java.util.Arrays;

 class Solution {
    public static int search(int[] nums, int target) {
        // Write your code here.
        int si = 0;
        int en = nums.length - 1;
        int mid = 0;

        while (si <= en) {

            mid = si + (en - si) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target <= nums[mid]) {
                en = mid - 1;

            } else if (target > nums[mid]) {
                si = mid + 1;

            }

        }

        return -1;
    }
}

public class binarySearch {
    public static void main(String[] args) {
        Solution sc = new Solution();
        int[] nums = { 1, 3, 7, 9, 11, 12, 45 };
        int target = 11;
        System.out.println(sc.search(nums, target));
    }
}
