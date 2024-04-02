import java.util.*;
class NextPermutation {
static int findJustGreaterIndexInSubarray(int startIndex,int[] arr ) {
        int endIndex=arr.length-1;
        int target=arr[startIndex];
        int justGreaterIndex = -1;
        int justGreater = Integer.MAX_VALUE;
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] > target && arr[i] < justGreater) {
                justGreater = arr[i];
                justGreaterIndex = i;
            }
        }
        return justGreaterIndex;
    }
                            
    static void swap(int i,int j,int[] arr){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
        }
    static void sortSubArray(int s,int e,int[] arr){
       for (int i=s;i<e;i++){

			for(int j=s;j<e;j++){
				
				if(arr[j]>arr[j+1]){
					
				//swaping	
				arr[j]   =arr[j]^arr[j+1];
				arr[j+1] =arr[j]^arr[j+1];
				arr[j]   =arr[j]^arr[j+1];
				}
			}
		}
        //System.out.println("s"+s+" e "+e+" arr "+Arrays.toString(arr));
         
        }    
    public static void main(String[] args) {
        int arr[] = {3,2,4,1};
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>arr[i-1]){
                     if(i==arr.length-1){
                        swap(i,i-1,arr);
                       // System.out.println("SWap i"+i +" arr "+Arrays.toString(arr));
                        break;
                     }
                   else{
                       //System.out.println("I "+i);
                       int index=findJustGreaterIndexInSubarray(i-1,arr);
                       //System.out.println("j= "+arr[j] +"B arr"+Arrays.toString(arr));
                       swap(i-1,index,arr);
                       //System.out.println("swap"+" A arr"+Arrays.toString(arr));
                       sortSubArray(i,arr.length-1,arr);
                       System.out.println(Arrays.toString(arr));
         
                       break;
                       }  
                }
            }
       
    }
}
