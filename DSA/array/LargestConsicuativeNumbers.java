import java.util.*;
class LargestConsicuativeNumbers{
	public static void main(String args[]){
		//HashSet<Integer> sort = new HashSet<Integer>();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.addAll(Arrays.asList(new Integer[] {100,200,1,3,4,2}));
		Collections.sort(arr);
		
		int reference=arr.get(0);
		int count=0,lvs=0;
		
		for(int i=0;i<arr.size();i++){			
			if(reference==arr.get(i)){
				count++;
				if(lvs<count){
					lvs=count;
					}
					}
			else {
				reference=arr.get(i);			
				count=1;
				}
			reference++;	
			}
			System.out.println(lvs);
		}
	}
