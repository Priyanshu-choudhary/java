//using moore voting algo
import java.util.*;
class FrequencyNby2{
	public static void main(String[] args)
	{	List<Integer> arr=new ArrayList<Integer>();
		arr.addAll(Arrays.asList(new Integer[] {1,0,0,0,0,2,0,0,1,2}));
		int majorityElement=arr.get(0);
		int count=0;
		
		for(int i=0;i<arr.size();i++){
			
			if(majorityElement==arr.get(i)){
				count++;
				}
			else{
				count--;
				}
			if(count==0){
				majorityElement=arr.get(i+1);
				count++;
				}
			if(count>=arr.size()/2){
				break;
				}	
			}
		System.out.println("majorityElement "+majorityElement+"  count "+count);
	
		}
}
