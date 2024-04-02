import java.util.*;
class LargestSubArrayWithSumK_OptimalSolution{
	static int subArrayCount=0;
	static int subArraySum(int start,int end,ArrayList arr){
		int sum=0;
		for(int i=start;i<=end;i++){
			sum +=(int)arr.get(i);
			subArrayCount++;
			}
		return sum;
	}
	public static void main(String[] args){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.addAll(Arrays.asList(new Integer[] {-2,1,-3,4,-1,2,1,-5,4}));
	
		int sumToBeFound=6;
		int lvs=0;
		for(int i=0;i<arr.size();i++){
			int subArraySum=subArraySum(0,i,arr);
				if(subArraySum==sumToBeFound ){
					if(lvs<=subArrayCount){
					lvs=subArrayCount;
				}
				}
				if(subArraySum>sumToBeFound){
					arr.remove(0);
					i=0;
				}	
				subArrayCount=0;
				}			
		System.out.println(lvs);
		}
		
	}


