
// Java program to implement
// the above function
  
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;
  
class Main {
    public static void main(String[] args)throws Exception{
   
        double currencyAmount = 1500.00;
	// Create a new Locale
	Locale usa = new Locale("en", "US");
// Create a Currency instance for the Locale
	Currency dollars = Currency.getInstance(usa);
// Create a formatter given the Locale
	NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
	NumberFormat dollarFormat2 = NumberFormat.getCurrencyInstance(canada);
// Format the Number into a Currency String
	System.out.println(dollars.getDisplayName() + ": " + dollarFormat.format(currencyAmount));
  	System.out.println(dollars.getDisplayName() + ": " + dollarFormat2.format(currencyAmount));
  	//System.out.println(dollars.getDisplayName() + ": " + dollarFormat.format(currencyAmount));
    }
}
