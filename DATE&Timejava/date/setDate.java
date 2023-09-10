import java.time.LocalDate;  
// String to LocalDate in java 8  
class LocalDateExample5   
{  
    public static void main(String ar[])   
    {  
        // Example 1  
        String dInStr = "2011-09-01";  
        LocalDate d1 = LocalDate.parse(dInStr);  
        System.out.println("String to LocalDate : " + d1);  
        // Example 2  
        LocalDate d2 = LocalDate.of(2017,12,23);  
        System.out.println("String to LocalDate : " + d2);  
    }  
}  
