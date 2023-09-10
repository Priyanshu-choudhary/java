
// Java program to implement
// the above function
  
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;
  
public class Main {
    public static void main(String[] args)throws Exception{
  
	double value = 4.2352989244d;

        NumberFormat nF = NumberFormat.getNumberInstance();
  
        // Initially currency
        System.out.println("Initially Currency: "+ nF.getCurrency());
  
        // Currency set to US
        nF.setCurrency(Currency.getInstance(Locale.CANADA));
  
        // Print the currency
        System.out.println("Currency set as: "+ nF.getCurrency());
    }
}
