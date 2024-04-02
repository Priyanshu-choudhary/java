import java.util.*;
class LargestSubArraySum_kadensAlgo{
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
		arr.addAll(Arrays.asList(new Integer[] {1,-2,1}));
	
		int sumToBeFound=6;
		int lvs=0;
		for(int i=0;i<arr.size();i++){
			int subArraySum=subArraySum(0,i,arr);
				if(lvs<=subArraySum){
					lvs=subArraySum;
				}
				
				if(subArraySum<=0){
					arr.remove(0);
					i=0;
				}	
				}			
		System.out.println(lvs);
		}
		
	}


