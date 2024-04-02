import java.util.*;
class FindTheNumberThatAppearOnes{
	public static void main(String[] args)
	{	ArrayList<Integer> s=new ArrayList<Integer>();
		s.addAll(Arrays.asList(new Integer[] {1,1,3,4,2,2,3,1,2,2,3,4,8,3}));
		int frq=0;
		int i=0;
		for(i=0;i<s.size();i++){
			if(frq==1){
				
				break;	
				}
			for(int j=0;j<s.size();j++){
			if(s.get(i)==s.get(j)){
				frq++;
				}
			if(frq==2){
				frq=0;
				break;
				}
			}
		}
			System.out.println("found--	"+s.get(i-1));	
	}
}

