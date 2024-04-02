import java.util.*;
class temp{
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
		arr.addAll(Arrays.asList(new Integer[] {7,6,4,3,1,6}));
		System.out.println(swap(2,0,arr));
	}
}
