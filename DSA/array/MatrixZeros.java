import java.util.*;
class MatrixZeros{
	static int[][] ConvertZero(int Raw,int collum,int [][] arrc){
		for(int c=0;c<arrc[Raw].length;c++){
			arrc[Raw][c]=0;
			}
		for(int r=0;r<arrc.length;r++){
			arrc[r][collum]=0;
			}
		return arrc;
		}
		
	static int[][] copy2DArray(int[][] arr) {
        int[][] copy = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        return copy;
    }
    static void print2DArray(int[][] array){
		for(int[] raw: array ){
		System.out.println(Arrays.toString(raw));
		}
		}
	public static void main(String args[]){
		int[][] arr ={
					 {1,1,1},
					 {1,0,1},
					 {1,1,1} 
					 };
		int[][] arrc = copy2DArray(arr);
		
		int Raw=0,collum=0;
		
		print2DArray(arr);
		
		for(int r=0;r<arr.length;r++){
			for(int c=0;c<arr[r].length;c++){			
				if(arr[r][c]==0){

				ConvertZero(r,c,arrc);
				}
			}
		}
		System.out.println("------------");
		print2DArray(arrc);
	}
}
