import java.util.*;

/**
 * MergeArrayWithOutExtraSpace
 */
public class MergeArrayWithOutExtraSpace {
    static void merge(int A[], int m, int B[], int n) {
        int insertIndex = m+n-1;
           int indexA = m-1,indexB = n-1;
           
           while(indexB>=0){
               if(indexA<0){
                   A[insertIndex--] = B[indexB--];
               }else{
                   if(B[indexB]>=A[indexA]){
                       A[insertIndex--] = B[indexB--];
                   }else{
                       A[insertIndex--] = A[indexA--];
                   }
               }
           }
       }
    public static void main(String[] args) {
       
   int nums1[]={1,2,3};
   int nums2[]= {2,5,6};
   int m=3,n=3; 
   merge(nums1, m, nums2, n);


     System.out.println(Arrays.toString(nums1));
    }
}