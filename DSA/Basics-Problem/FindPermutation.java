import java.util.Arrays;
import java.util.Scanner;

 class NextPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        // Convert the input string to an array of integers
        int[] nums = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            nums[i] = input.charAt(i) - '0';
        }
	//for(int i=0;i<24;i++ ){
        nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums).replaceAll("[^0-9]", ""));
   // }
}
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Find the first element from the right that is smaller than the next element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
            //System.out.println("i dec");
        }

        if (i >= 0) {
            // Find the smallest element to the right of nums[i] that is greater than nums[i]
            int j = n - 1;
            
            while (j >= 0 && nums[j] <= nums[i]) {
            //System.out.println("nums[j] <= nums[i]"+nums[j] +"	"+ nums[i]+"	I"+i+"	j"+j);
                j--;
            }

            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Reverse the sub-array nums[i+1:n-1]
        //System.out.println("Rec");
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
