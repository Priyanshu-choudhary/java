import java.io.*;
import java.util.*;
public class quickshort{

int quickshort1(int[] arr,int low, int high){
int pivot = arr[high];
int i=low-1;
for(int j=low;j<=high;j++){
    if(pivot>=arr[j] ){
                i++;
                if(j>i){
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                }
        }
}
//System.out.println(i);
return i;
}

void sort(int[] arr, int low, int high)
{
    if (low < high)
    {
        int pi = quickshort1(arr, low, high);

        // Recursively sort elements before
        // partition and after partition
        sort(arr, low, pi-1);
        sort(arr, pi+1, high);
    }
}

public static void main (String args[]){
quickshort qs = new quickshort();

int[] arr ={67,8,34,8,5,1,0,55,4342,343343,424,2,2,432,432,32,42,42,42,4242,};
qs.sort(arr,0,arr.length-1);

for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+" ");
}
}
}
