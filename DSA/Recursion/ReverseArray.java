import java.util.*;
class ReverseArray {


	static int i=0;
	
	static int[] arrReverse(int arr[],int j){
		if(i==j){return arr ;}
		else{
		arr[i]=arr[i]^arr[j];
		arr[j]=arr[i]^arr[j];
		arr[i]=arr[i]^arr[j];
		j--;
		i++;
		
		arrReverse(arr,j);
		}
	return arr;
		
		}
public static void main(String args[]){
		
	int arr[]={1,2,3,4,5,6,7,8,9};
	System.out.println(Arrays.toString(arrReverse(arr,arr.length-1)));
	}
}

