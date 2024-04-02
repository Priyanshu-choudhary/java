
import java.util.*;
class MoveAllZerosAtTheEnd{



	public static void main(String[] args)
	{	List<Integer> lk=new ArrayList<Integer>();
		Scanner in =new Scanner(System.in);
		System.out.println("enter Array of size 5");
		 for(int i=0;i<5;i++){
			 int number = in.nextInt();
			 lk.add(i,number);
			
			}
		 System.out.println("link list="+lk);
		 //int endIndex=
		for(int i=0;i<lk.size();i++){
			if(lk.get(i)==0){
			lk.add(lk.size(),0);
			lk.remove(i);
			}
		}	
		System.out.println("remove "+lk);
	}
}
