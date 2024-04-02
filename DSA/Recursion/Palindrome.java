import java.util.*;
class Palindrome{


	static int i=0;
	static int flag =0;
	
	static void check(String str,int j){
		
		if(str.charAt(i)!=str.charAt(j)){ flag =0;return ;}
		else{
			j--;
			i++;
			if(str.length()%2!=0){
				if(i==j && str.charAt(i)==str.charAt(j)){flag =1;return ;}//if odd
				else if(i==j && str.charAt(i)!=str.charAt(j)){flag =0;return ;}
			}else {
				if(i==j-1&& str.charAt(i)==str.charAt(j)){flag =1;return ;}//if even
				else if(i==j && str.charAt(i)!=str.charAt(j)){flag =0;return ;}
			}
			check(str,j);
			}

}
		
		
public static void main(String args[]){
		
	String str="aeified";
	
	check(str,str.length()-1);
	System.out.println(flag);
	
	}
}
