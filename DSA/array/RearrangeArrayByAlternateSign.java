import java.util.*;
class RearrangeArrayByAlternateSign{
	static	ArrayList swap(int i ,int j, ArrayList arr){
		int temp=  (int)arr.get(i);
		arr.remove(i);
		if(i<j){
			arr.add(i,arr.get(j-1)); 
		}else{
			arr.add(i,arr.get(j));
			}
			arr.remove(j);
			arr.add(j,temp);
		return arr;
		}
	
	public static void main(String[] args){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.addAll(Arrays.asList(new Integer[] {1,2,-3,4,-2,-1,-5,5}));
	
		int SwapNeg=-1;
		int SwapPos=-1;
		
		for(int i=0;i<arr.size();i++){
			
			if(i%2==0 ){//check at  even postion of arr have + number or -   (Should have + number)
				if(arr.get(i)<0){
					SwapNeg=i;
					}
				}
				
			if(i%2!=0 ){//check at  odd postion of arr have + number or -   (Should have - number)
				if(arr.get(i)>0){
					SwapPos=i;
					}
				}
				
			if(SwapNeg>0&&SwapPos>0){//Run this condition only when we found both the wrong Position then olny swap 
				
				swap(SwapNeg,SwapPos,arr);
				SwapNeg=-1;
				SwapPos=-1;
				}			

			}			
		System.out.println("Ans"+arr);
		}
		
	}




