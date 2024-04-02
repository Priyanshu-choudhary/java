import java.util.*;
class BuyAndSell{
	
	
	public static void main(String[] args){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.addAll(Arrays.asList(new Integer[] {7,6,4,3,1,6}));
	
		int buyDay=arr.get(0);
		int sellDay=0;
		for(int i=0;i<arr.size();i++){
			if(buyDay>arr.get(i)){
				buyDay=arr.get(i);
				}
			if(sellDay>buyDay && sellDay<arr.get(i)){
				sellDay=arr.get(i);
				}	
		}			
		System.out.println("B"+buyDay+" S"+sellDay);
		}
		
	}



