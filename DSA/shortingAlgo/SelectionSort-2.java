import java.util.*;
class SelectionSort {
	public static void main(String[] args)
	{
		int arr[] = { 4, 3, 2, 1,75,35,433,132,5465,7643,2,1,3,353,434,343,4311,9 };
		for (int i=0;i<arr.length;i++){
			int min=i;
			
			for (int j=i+1;j<arr.length;j++){
	
			
				if(arr[min]>arr[j]){
					min=j;
					}
			}
		//swaping
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
		
		//arr[i]	=arr[i]^arr[min];
		//arr[min]  =arr[i]^arr[min];
		//arr[i]	=arr[i]^arr[min];
		
		}
	System.out.print(Arrays.toString(arr));	
	}
}
