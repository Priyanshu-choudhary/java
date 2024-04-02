import java.util.*;
class TwoSum{
	public static void main(String[] args)
	{	ArrayList<Integer> s=new ArrayList<Integer>();
		s.addAll(Arrays.asList(new Integer[] {2,6,5,8,11}));
		
		int sumToBeFound=8;
		for(int i=0;i<s.size();i++){
			for(int j=0;j<s.size();j++){
				if(s.get(i)+s.get(j)==sumToBeFound && i!=j){
					System.out.println(i+"   "+j);
					}
				}		
			}	

			
	}
}


