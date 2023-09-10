import java.text.*;
import java.util.*;
class currencyFromatterDemo{
public static void main(String[] args){

double currencyAmount = 1500.00;
// Create a new Locale

Locale usa = new Locale("en", "US");
Currency dollars = Currency.getInstance(usa);
NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
System.out.println(dollars.getDisplayName() + ": " + dollarFormat.format(currencyAmount));




Currency inr = Currency.getInstance("INR");  
//Locale usa = new Locale("en", "US");

NumberFormat inrFormat = NumberFormat.getCurrencyInstance(inr);
System.out.println(inr.getDisplayName() + ": " + inrFormat.format(currencyAmount));

}
}
