
    /*
     * upper bond in array is no. which is just 1 greater to target number.
     */
     class Solution {
        public static int lowerBound(int[] arr, int n, int x) {
          int low = 0, high = n;
          int ans=0;
          while (low < high)
        {
            int mid = low + (high - low) / 2;

            // If x is greater than or equal to arr[mid],
            // we search in [mid+1,high].
            if (arr[mid] <= x)
            {
                low = mid + 1;
            }
            // Else we search in [low,mid].
            else
            {
                high = mid;
            }
        }
          return low;
        
        }
    }


public class FindUpperBondIndex {
    public static void main(String[] args) {
        Solution sc = new Solution();
        int[] nums = { 5, 12 ,12 ,15 ,18 ,21 ,35 ,37 ,38 ,46 ,47 ,48 ,48, 50  };
        int target = 45;
        System.out.println(sc.lowerBound(nums, nums.length-1, target));
    }
}
