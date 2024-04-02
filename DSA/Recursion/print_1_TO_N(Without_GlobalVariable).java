class printNumber {
	static void print(int i,String name){
		if(i==0){return ;}
		System.out.println(name);
		print(i-1,name);
		}
	public static void main(String args[]){
		String name ="yadi";
		print(5,name);
		}
	}
