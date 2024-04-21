
/*
 * upper bond in array is no. which is just 1 greater to target number.
 */

import java.util.Scanner;

class Solution {
    public static int lowerBound(int[] nums, int n, int target) {
        // Write your code here
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

            if (mid == en && nums[mid] != target) {//for last value
                
                return mid + 1;
            }
        

        return mid;

    }
}

class SearchInsertPosition {
    public static void main(String[] args) {
        Solution sc = new Solution();
        Scanner in=new Scanner(System.in);
        int[] nums = { 1, 2, 4, 7 };
        System.out.println(" enter Target ");
        int target = in.nextInt();
        System.out.println(sc.lowerBound(nums, target, target));
       
    }
}
