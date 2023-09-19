import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class regexTagSelector{
public static void main(String[] args) {
Pattern pattern = Pattern.compile("([A-Za-z]+( [A-Za-z]+)+)", Pattern.CASE_INSENSITIVE);
Matcher matcher = pattern.matcher("<h1>hello my name is yadi</h1>");

while (matcher.find()) {
    System.out.println("Found the text \"" + matcher.group() + "\" starting at " + matcher.start()
+ " index and ending at index " + matcher.end());
}

}}