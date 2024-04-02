import java.util.*;
class LargestSubArraySum{
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
		int arr[]={-2,1,-3,4,-1,2,1,-5,4};
		int sumToBeFound=5;
		int lvs=0;

		for(int i=0;i<arr.length;i++){
			for(int k=i;k<arr.length;k++){
				sumToBeFound=subArraySum(i,k,arr);
					
					if(lvs<=sumToBeFound){
					lvs=sumToBeFound;
					
					}
				
			subArrayCount=0;	
			}
		}
		System.out.println(lvs);
	}
}
