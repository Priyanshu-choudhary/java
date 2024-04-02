import java.util.*;
class SecoundLargestElement {
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
	{
		int arr[] = { 4, 3, 2, 1,75,35,433,132,5465,7643,2,1,3,353,434,343,4311,9 };
		int[] sort=sort(arr);	
		for(int i=0;i<arr.length;i++)
		if(sort[0]<sort[i]){
			System.out.print("Secound lrgest emlement "+arr[i]);
			break;
			}
	}
}
