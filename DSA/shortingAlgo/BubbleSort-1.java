import java.util.*;
class BubbleSort-1.java {
	public static void main(String[] args)
	{
		int arr[] = { 4, 3, 2, 1,75,35,433,132,5465,7643,2,1,3,353,434,343,4311,9 };
		for (int i=0;i<arr.length-1;i++){

			for(int j=0;j<arr.length-1;j++){
				
				if(arr[j]>arr[j+1]){
					
				//swaping	
				arr[j]   =arr[j]^arr[j+1];	
				arr[j+1] =arr[j]^arr[j+1];
				arr[j]   =arr[j]^arr[j+1];
				}
			}
		}

	System.out.print(Arrays.toString(arr));	
	}
}

