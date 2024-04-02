import java.util.*;
class FindFrequency{
	public static void main(String[] args)
	{	ArrayList<Integer> s=new ArrayList<Integer>();
		s.addAll(Arrays.asList(new Integer[] {1,1,3,4,2,2,3,1,2,2,3,4,8,3}));
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int el: s){
			
			hm.put(el,hm.getOrDefault(el,0)+1);		
			}	

			System.out.println(hm);
	}
}

