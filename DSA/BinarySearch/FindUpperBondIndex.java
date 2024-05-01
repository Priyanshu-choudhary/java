
    /*
     * upper bond in array is no. which is just 1 greater to target number.
     */
    class Solution {
        public static int lowerBound(int[] nums, int n, int target) {
            // Write your code here
            int si = 0;
            int en = nums.length - 1;
            int mid = 0;
            int ans=-1;
            while (si <= en) {

             mid = si + (en - si) / 2;
              if (target<=nums[mid]) {
                ans=mid;
                en=mid-1;
              }else{
                si=mid+1;
              }
            }
           
            return ans;

        }
    }


class FindUpperBondIndex {
    public static void main(String[] args) {
        Solution sc = new Solution();
        int[] nums = { 1 ,4, 7 ,8 ,10};
        int target = 3;
        System.out.println(sc.lowerBound(nums, target, target));
    }
}
