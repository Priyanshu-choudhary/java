
/*
 * upper bond in array is no. which is just 1 greater to target number.
 */

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int[] lowerBound(int[] nums, int n, int target) {
        // Write your code here
        int si = 0;
        int en = nums.length - 1;
        int mid = 0;
        int[] result = { 0, 0 };
      try {
        while (si <= en) {

            mid = si + (en - si) / 2;

            if (target == nums[mid]) {
                
                result[0]=nums[mid];
                result[1]=nums[mid];
                return result;

            } else if (target <= nums[mid]) {
                en = mid - 1;

            } else if (target > nums[mid]) {
                si = mid + 1;
            }

        }

        if (mid == en && nums[mid] != target) {// for last value
       
            result[0] = nums[mid];
            result[1] = nums[mid + 1];
            return result;
        }

       
        result[0] = nums[mid-1];
        result[1] = nums[mid];
        return result;

      } catch (Exception e) {
            if (target<nums[0]) {
                result[0]=-1;
                result[1]=nums[0];   
            }else{
                result[0]=nums[nums.length-1];
                result[1]=nums.length;
            }
      }
        
    }
}

class cielTheFloor {
    public static void main(String[] args) {
        Solution sc = new Solution();
        Scanner in = new Scanner(System.in);
        int[] nums = { 1, 2, 4, 7 };
        System.out.println(" enter Target ");
        int target = in.nextInt();
        System.out.println(Arrays.toString(sc.lowerBound(nums, target, target)));

    }
}
