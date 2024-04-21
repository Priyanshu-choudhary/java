import java.util.*;
class DublicateZeros {
    public static void duplicateZeros(int[] arr) {
        int cnt=0,temp=arr[0],flag=0,temp2=0;
        int[]arr2=new int[arr.length];
        for(int i=0,j=0;i<arr.length;i++){
        
        try {
            if(arr[i]==0){
              arr2[i+j]=arr[i];
              arr2[i+j+1]=0;
                
                j++;                    
             }else{
                arr2[i+j]=arr[i];
             }
        } catch (Exception e) {}

        }
        for (int j2 = 0; j2 < arr2.length; j2++) {
            arr[j2]=arr2[j2];
           }
       

    }
    public static void main(String[] args) {
        int []arr={1,0,0,2,3,0,4,5,0};
               // [1, 0, 0, 0, 2, 3, 0, 0, 0]
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
   
}