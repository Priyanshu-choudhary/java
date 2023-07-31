import java.util.*;
class DecimalTObinary{
	
	static int binary[100];
	
	public void DtoB(int c ,int n){
		int j=0;
		int i=0;
		for(i=-1;n!=0;i++){
			for(j=c;j!=-1;j--){
				if(n%2!=1){
				 	binary[j]=0;
				}
				else{
					binary[j]=1;
				}
			}
		n=n/2;
		}	

	}
	public void P_binary(int c){
		for(int i;i<=c;i++){	
			System.out.print("binary:"+binary[i]);
		}
	}
	public int counter(int n){
		int i=0;
		for(i=0;n!=0;i++){
			n=n/2;
		}
		return i;
	}
	public static void main(String[] args){
		DecimalTObinary convert=new DecimalTObinary();
		Scanner  in=new Scanner(System.in);
		
		while(true){
			System.out.print("\nenter number");
			int n = in.nextInt();
			int c = convert.counter(n);
			convert.DtoB(c,n);
			convert.P_binary(c);
		}
	}
}