/**
 * MAxSubArrayProduct
 */
public class MAxSubArrayProduct {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,88,91,0,-2000,-9000,0,-700000,300000 };
        long product=1,maxP=0,noOfNegNumber=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
            product*=arr[i];   
            
            if (maxP<product) {
                maxP=product;
            }   
        }else{
                product=1;
            }
        }
        System.out.println(maxP);
    }

}