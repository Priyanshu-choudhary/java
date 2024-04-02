
import java.util.*;
class LargestConsicuativeOnes{
	public static void main(String[] args)
	{	ArrayList<Integer> s=new ArrayList<Integer>();
		s.addAll(Arrays.asList(new Integer[] {1,0,1,1,0,1,1,0,0,1,1,1,0,0}));
		int sum=0;
		int lastval=0;
		for(int j=0;j<s.size();j++){
		if(s.get(j)==1){
			
			sum++;
			if(lastval<sum){
					lastval=sum;
				}
			}else{
				
				sum=0;
				}	
		}
		System.out.println("sum"+lastval);			
	}
}
