import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    //read input
    double num = sc.nextDouble();
    //create numberformat for each country
    NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

    // Create a custom Locale for English in India
    Locale indiaLocale = new Locale("en", "IN");
    NumberFormat indiaCurrencyFormat = NumberFormat.getCurrencyInstance(indiaLocale);
    NumberFormat chinaCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat franceCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    //format each number
    String usFormattedAmount = usCurrencyFormat.format(num);


    String indiaFormattedAmount = indiaCurrencyFormat.format(num);
    String chinaFormattedAmount = chinaCurrencyFormat.format(num);
    String franceFormattedAmount = franceCurrencyFormat.format(num);
    //print each nbumber
    System.out.println("US: " + usFormattedAmount);
    System.out.println("India: " + indiaFormattedAmount);
    System.out.println("China: " + chinaFormattedAmount);
    System.out.println("France: " + franceFormattedAmount);

}
}
