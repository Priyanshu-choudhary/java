import java.util.*;
public class mergeShort{
 void conqur(int[] arr ,int si,int mid,int en){
    int merge[]= new int[si-en+1];
    int idx1 =si;
    int idx2 =mid+1;
    int x =0;
    while (idx1 <=mid&&idx2<=en) {
        if (arr[idx1]<=arr[idx2]) {
            merge[x]=arr[idx1];
            x++;idx1++;
        }else{
            merge[x]=arr[idx2];
            x++;idx2++;
        }
    }
    while (idx1 <=mid) {
        merge[x]=arr[idx1];
        x++;idx1++;
    }
    while (idx2 <=en) {
        merge[x]=arr[idx2];
        x++;idx2++;
    }
    for (int i = 0,j=si; i < merge.length; i++,j++) {
        arr[j]=merge[i];
        
    }
 }
 void divide(int[] arr ,int si,int en){
    if(si< en){
    int mid=si+(en-si)/2;
    divide(arr,si,mid-1);
    divide(arr,mid+1,en);
    conqur(arr,si,mid,en);
    }
 }
    public static void main(String[] args) {
        mergeShort mg =new mergeShort();
        int[] arr={2,4,56,43,23,2,1,11,12,34,67,8,7664,4};
        mg.divide(arr,0,arr.length-1);    
    }
}