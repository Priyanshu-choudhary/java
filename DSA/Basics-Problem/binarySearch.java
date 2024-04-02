public class binarySearch {
   int bsFind (int arr[]  ,int no){
       int a=0;
       int b=0;
       int mid=0;
       b=arr.length;
       mid=a+b/2;
       for(;;){
           if(arr[mid]==no){return mid;}
           if(arr[0]<arr[arr.length-1]){
                 if(arr[mid]<no){mid=(int)(mid+b)/2;}
               else  if(arr[mid]>no){mid=(int)(mid+a)/2;}
           }
           else{
               if(arr[mid]>no){mid=(int)(mid+b)/2;}
               else if(arr[mid]<no){mid=(int)(mid+a)/2;}
           }
       }
       
   }
    
    public static void main(String[] args) {
        binarySearch bs = new binarySearch();
        int[] arrDecreaing ={9,8,7,6,5,4,3,2,1};
        int[] arrIncreasing ={1,2,3,4,5,6,7,8,9};
        System.out.println("Pos!"+bs.bsFind(arrDecreaing,7));
        System.out.println("Pos!"+bs.bsFind(arrIncreasing,7));
        
    }
}
