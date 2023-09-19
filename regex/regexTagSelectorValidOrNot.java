import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class regexTagSelector{
public static void main(String[] args) {
Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)<\\/\\1>", Pattern.CASE_INSENSITIVE);  //([A-Za-z]+( [A-Za-z]+)+)
Matcher matcher = pattern.matcher("<h1>Nayeem loves counseling</h1><h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par><Amee>safat codes like a ninja</amee><SA premium>Imtiaz has a secret crash</SA premium>");


while (matcher.find()) {
    System.out.println(matcher.group(2));
}

}}