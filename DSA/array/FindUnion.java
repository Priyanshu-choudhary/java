
import java.util.*;
class FindUnion{

	public static void main(String[] args)
	{	Set<Integer> s=new HashSet<Integer>();
		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> su=new HashSet<Integer>();
			 s.add(1);
			 s.add(1);
			 s.add(2);
			 s.add(5);
			 s.add(6);
			 
			 s1.add(1);
			 s1.add(3);
			 s1.add(4);
			 s1.add(5);
			 s1.add(6);

		for(int i=0;i<s.size()+s1.size();i++){
			su.addAll(s);
			su.addAll(s1);
		}	
		System.out.println("union "+su);
	}
}
