import java.util.*;
class LeftShiftAnArray{
	static int[] sort(int[] arr){
		for (int i=0;i<arr.length;i++){
			int min=i;
			for (int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
					}
			}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
		}
	return arr;

}

	public static void main(String[] args)
	{	List<Integer> lk=new ArrayList<Integer>();
		List<Integer> shifted=new ArrayList<Integer>();
		Scanner in =new Scanner(System.in);
		System.out.println("enter Array of size 5");
		 for(int i=0;i<5;i++){
			 int number = in.nextInt();
			 lk.add(i,number);
			
			}
		 System.out.println("link list="+lk);
		 System.out.println("enter no. of digits you want to shift");
		 int j = in.nextInt();
		
		int s=lk.size();
		
		//copy last elements from arr and adding into starting
		for(int i=0;i<j;i++){
			shifted.add(i,lk.get(s-j+i));
			}
		////copy Remanig elements and adding
		for(int i=0;i<s-j;i++){
			shifted.add(i+j,lk.get(i));
			}	
		
			
		System.out.println("shifted "+shifted);
	}
}
