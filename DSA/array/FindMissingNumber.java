
import java.util.*;
class FindMissingNumber{
	public static void main(String[] args)
	{	ArrayList<Integer> s=new ArrayList<Integer>();
		s.addAll(Arrays.asList(new Integer[] {1,2,4,5,6,7}));
		for(int i=s.get(0);i<s.size();i++){
			if(i!=s.get(i-1)){
				System.out.println("missed"+i);	
			break;
				}
		}		
	}
}
