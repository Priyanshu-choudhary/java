import java.util.*;

class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
		int frequency=0;
        Map<Character,Integer> tm =new TreeMap<Character,Integer>();
		Map<Character,Integer> tm2 =new TreeMap<Character,Integer>();

		for(int i=0;i<a.length();i++){
			for(int j=0;j<a.length();j++){
				if(a.charAt(i)==a.charAt(j)){
					frequency++;
					tm.put(a.charAt(i),frequency);
					}
				}
			frequency=0;
			}
		
		for(int i2=0;i2<b.length();i2++){
			for(int j2=0;j2<b.length();j2++){
				if(b.charAt(i2)==b.charAt(j2)){
					frequency++;
					tm2.put(b.charAt(i2),frequency);
					}
				}
			frequency=0;
			}
		System.out.println(tm);
		System.out.println(tm2);
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        //System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
