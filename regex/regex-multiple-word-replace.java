import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class GfG{
public static void main(String[] args) {
    String regex = "(?i)\\b(\\w+)\\b(?:\\s+\\1)+\\b";
    Pattern p = Pattern.compile(regex);

    Scanner in = new Scanner(System.in);
    int numSentences = Integer.parseInt(in.nextLine());
    
    while (numSentences-- > 0) {
        String ss = in.nextLine();
        
        Matcher m = p.matcher(ss);
        
        // Check for subsequences of ss that match the compiled pattern
        while (m.find()) {
            ss = ss.replaceAll(regex, "$1");
        }
        // Prints the modified sentence.
        System.out.println(ss);
       
    }
    
    in.close();

}

}