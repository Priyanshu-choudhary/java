
import java.util.*;
class FindMissingNumberXor{
	static int findMissingNumber(int[] arr){
		int xor=0,min=arr[0],max=0;
		for (int i :arr) {
			xor=xor^i;
		if (min>i) {min=i;}
		if (max<i) {max=i;}
		}
		for (int i = min; i <= max; i++) {
			xor=xor^i;
		}
		 return xor;
	}
	public static void main(String[] args)
	{	int[] arr={5,4,1,3,7,2};
	System.out.println(findMissingNumber(arr));
	}		
}

