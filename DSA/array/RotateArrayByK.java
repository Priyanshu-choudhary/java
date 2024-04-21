import java.util.*;

class RotateArrayByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        // 32145 first loop rotate first k terms
        // 32154 secound loop rotate last (total-k) terms
        // 45123 third loop reverse entire array but loop only run for k times

        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int k = sc.nextInt();
        int i, j;

        // Reverse the first n-k terms
        for (i = 0, j = n - k - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
        // Reverse last k numbers
        for (i = n - k, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));

        // Reverse the entire array
        for (i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
        
     
}