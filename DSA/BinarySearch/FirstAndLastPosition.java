

/*
 * upper bond in array is no. which is just 1 greater to target number.
 */

 import java.util.*;
  class Solution {
 
     public static int[] firstAndLastPosition(ArrayList<Integer> nums, int n, int target) {
     
          int si = 0;
          int en = nums.size() - 1;
          int mid = 0;
          int[] result={0,0};
              while (si <= en) {
                mid = si + (en - si) / 2;
                
                System.out.println(">>>>null"+nums.get(mid));
                if (nums.get(mid)==target) {
                    result[0]=mid;
                  try{ while(nums.get(mid-1)==target){
                        mid-=1;
                        result[0]=mid; 
                    }
                    result[1]=mid;
                    while(nums.get(mid+1)==target){
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
                    return result;
                }else if(target<=nums.get(mid)){
                    en=mid-1;
                }else if(target>nums.get(mid)){
                    si=mid+1;
                }
              }
              result[0]=-1;
              result[1]=-1;
              return result;
     }
 
 }
 
 class LastOccurrenceInAsortedArray {
     public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(new Integer[] {1, 2,2,2,2,3, 4, 7}));
         Solution sc = new Solution();
         Scanner in=new Scanner(System.in);
         System.out.println(" enter Target ");
         int target = in.nextInt();
         System.out.println(Arrays.toString(sc.firstAndLastPosition(nums, target, target)));
        
     }
 }
 