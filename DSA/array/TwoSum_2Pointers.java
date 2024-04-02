import java.util.*;
class TwoSum_betterApproch{
	public static void main(String[] args)
	{	Set<Integer> s=new HashSet<Integer>();
		s.addAll(Arrays.asList(new Integer[] {2,6,5,8,11}));
		//sort the given array
		
		List<Integer> arr=new ArrayList<Integer>();
		arr.addAll(s);

		int target=18,i=0,j=arr.size()-1;
		
		
		while(i!=j){
			if(arr.get(i)+arr.get(j)==target){
				System.out.println("Yes");
				break;
			}
			else if(arr.get(i)+arr.get(j)<target){
				i++; //increase
				}
			else if(arr.get(i)+arr.get(j)>target){
				j--; //decrease
				}
				
			if(i>arr.size()/2 || j<arr.size()/2){
				System.out.println("No");
				break;
				}
		}
				
	}
}
