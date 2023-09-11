import java.util.*;

class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
		int frequency=0;
        Map<char,Integer> tm =new TreeMap<char,Integer>();

		for(int i=0;i<a.length();i++){
			for(int j=0;j<a.length();j++){
				if(a.charAt(i)==a.charAt(j)){
					frequency++;
					tm.put(a.charAt(i),frequency);
					}
				}
			frequency=0;
			}
		System.out.println(tm);
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
