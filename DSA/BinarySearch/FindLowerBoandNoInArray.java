 /*
  * lower bond in array is no. which is just 1 less or equal to target number.
  */
 class Solution {
    public static int lowerBound(int []nums, int n, int target) {
        // Write your code here
           int si = 0;
        int en = nums.length - 1;
        int mid = 0;

        while (si <= en) {

            mid = si + (en - si) / 2;
            if (target == nums[mid]) {
               
                return mid+1;
            } else if (target <= nums[mid]) {
                en = mid - 1;

            } else if (target > nums[mid]) {
                si = mid + 1;

            }

        }
       // System.out.println("mid "+mid);
        if (mid==en&&nums[mid]!=target) {
            return mid+1;
        }
        return mid;
    
    }
}
class Lowerboand {
    public static void main(String[] args) {
        FindLowerBoandNoInArray sc = new FindLowerBoandNoInArray();
        int[] nums = { 1, 1, 1, 1, 1, 1, 1 };
        int target = 1;
        System.out.println(sc.lowerBound(nums, target, target));
    }
}
