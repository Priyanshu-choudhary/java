


/*
 * upper bond in array is no. which is just 1 greater to target number.
 */

 import java.util.*;
  class Solution {
 
     public static int firstAndLastPosition(int []nums, int n, int target) {
     
          int si = 0;
          int en = nums.length - 1;
          int mid = 0;
          int[] result={0,0};
              while (si <= en) {
                mid = si + (en - si) / 2;
                
                if (nums[mid]==target) {
                    result[0]=mid;
                  try{ while(nums[mid-1]==target){
                        mid-=1;
                        result[0]=mid; 
                    }
                    result[1]=mid;
                    while(nums[mid+1]==target){
                        mid+=1;
                        result[1]=mid; 
                    }
                }catch(Exception e){
                   try {
                    while(nums[mid+1]==target){
                        mid+=1;
                        result[1]=mid; 
                    }
                   } catch (Exception a) {
                    // TODO: handle exception
                   } 
                }
                    return result[1]-result[0]+1;
                }else if(target<=nums[mid-1]){
                    en=mid-1;
                }else if(target>nums[mid-1]){
                    si=mid+1;
                }
              }
              result[0]=-1;
              result[1]=-1;
              return 0;
     }
 
 }
 
 class FindFrequencyUsingBinarySearch {
     public static void main(String[] args) {
        //ArrayList<Integer> nums=new ArrayList<>();
        //nums.addAll(Arrays.asList(new Integer[] {1, 2,2,2,2,3,4, 4, 7}));
        int[] nums= {1, 1, 1, 2 ,7 ,9 ,11 ,11 ,16, 17, 19 };
        Solution sc = new Solution();
         Scanner in=new Scanner(System.in);
         System.out.println(" enter Target ");
         int target = in.nextInt();
        
         System.out.println(sc.firstAndLastPosition(nums, target, target));
     
        
     }
 }
 