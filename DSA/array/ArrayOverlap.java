/**
 * ArrayOverlap
 */
public class ArrayOverlap {

    public static void main(String[] args) {
        int  arr[][]={{1,4},{4,5}};
        int p=arr[0][1];
        System.out.print(arr[0][0]);
        for (int i= 1; i < arr.length; i++) {
            if (p<arr[i][0]) {
                System.out.print("-"+p+" "+arr[i][0]);
                p=arr[i][1];
            }else{
                p=(p<arr[i][1])?arr[i][1]:p;
            }

        }
        
        System.out.println("-"+arr[arr.length-1][1]);
    }
}