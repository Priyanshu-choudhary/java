import java.io.*;
import java.util.*;
public class quickShort{
int[] quickshort1(int[] arr){
int pivot = arr.length-1;
int i=-1;
for(int j=0;j<arr.length;j++){
	if(pivot>arr[j] ){
		i++;
		if(j>i){
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
	}
}
return arr;
}
public static void main (String args[]){
quickShort qs = new quickShort();

int[] arr ={4,2,3,0,1,9,8,7,5,6};
System.out.println("arr="+Arrays.toString(qs.quickshort1(arr)));

}
}
