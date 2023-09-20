import java.math.*;
import java.util.*;
class DemoBigDecimal{
    public static void main(String[] args) {
        // Subtraction using double
        double a=0.03;
        double b=0.02;
        System.out.println(a-b);
        // Subtraction with BigDecimal
        BigDecimal bd1=new BigDecimal("0.03");
        BigDecimal bd2=new BigDecimal("0.02");
        System.out.println(bd1.subtract(bd2));

   
BigDecimal bbd1, bbd2, bbd3;

bbd1 = new BigDecimal("335.00");
bbd2 = new BigDecimal("335.00");
bbd3 = new BigDecimal("335");

// create 2 boolean objects
Boolean bb1,bb2;

// assign the result of equals method to b1, b2
bb1 = bbd1.equals(bbd2);
bb2 = bbd1.equals(bbd3);
// print b1, b2 values
System.out.println( bbd1 + " equals " + bbd2 + " is " +bb1);
System.out.println( bbd1 + " equals " + bbd3 + " is " +bb2 );


BigDecimal cbd1, cbd2;

cbd1 = new BigDecimal("2.36617");

MathContext mc = new MathContext(3); // 3 precision

// bg1 is rounded using mc
cbd2 = cbd1.round(mc);

String str = "The value " + cbd1 + " after rounding is " + cbd2;

// print bg2 value
System.out.println( str );
 


      // create 2 BigDecimal Objects
      BigDecimal ebd1, ebd2;

      ebd1 = new BigDecimal("23342424");
      ebd2=new BigDecimal("324234234234");
    //   Addition of two BigDecimal Number using add() method
      System.out.println("Addition of two BigDecimal "+ebd1.add(ebd2));
    //   Subtraction of two BigDecimal using subtract method
      System.out.println("Subtraction of two BigDecimal "+ebd1.subtract(ebd2));
    //   Multiplication of two BigDecimal Number
      System.out.println("Multiplication of two BigDecimal "+ebd1.multiply(ebd2));
    //    Calculate power of BigDecimal Number
      System.out.println("Find power of BigDecimal "+ebd1.pow(4));
    //   Division of two BigDecimal Number
    // System.out.println(ebd2.divide(bd1,BigDecimal.ROUND_UP));
    
    System.out.println(ebd2.divide(bd1));
    
      
   }
}




