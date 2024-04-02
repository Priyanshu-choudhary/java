import java.util.*;
class LargestSubArrayWithSumK{
	static int subArrayCount=0;
	static int subArraySum(int start,int end,int[] arr){
		int sum=0;
		for(int i=start;i<=end;i++){
			sum +=arr[i];
			subArrayCount++;
			}
		return sum;
	}
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,1,1,1,1,1};
		int sumToBeFound=5;
		int lvs=0;

		for(int i=0;i<arr.length;i++){
			for(int k=i;k<arr.length;k++){
				if(subArraySum(i,k,arr)==sumToBeFound ){
					
					if(lvs<=subArrayCount){
					lvs=subArrayCount;
					}
				}			
			subArrayCount=0;	
			}
		}
		System.out.println(lvs);
	}
}
