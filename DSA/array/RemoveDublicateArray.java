import java.util.*;
class RemoveDublicateArray {
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
		int arr[] = { 4, 3, 2, 1,75,35,433,132,5465,7643,2,1,3,353,434,343,4311,9 };
		int[] sort=sort(arr);	
		
		//adding elements
		for(int i=0;i<arr.length;i++){
		lk.add(i,arr[i]);
		}
		
		//removing Dublicate elements 
		int j=1;
		for(int i=0;i<arr.length-j;i++){
			if(lk.get(i)==lk.get(i+1)){
				lk.remove(i);
				j++;
			}
		}
		System.out.print(lk);
	}
}
