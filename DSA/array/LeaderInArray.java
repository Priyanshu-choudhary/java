import java.util.*;
class LeaderInArray{
	public static void main(String args[]){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.addAll(Arrays.asList(new Integer[] {7,8,4,5,1,2}));
		int learder=arr.get(arr.size()-1);
		for(int i=arr.size()-1;i>=0;i--){
			if(learder<=arr.get(i)){
				learder=arr.get(i);
				}else{
					arr.remove(i);
					}
			}
			System.out.println(arr);
		}
	}
