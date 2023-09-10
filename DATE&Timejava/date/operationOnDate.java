import java.time.LocalDate;    
class LocalDateExample2 {    
  public static void main(String[] args) { 
	   
    Date date1 = Date.of(2017, 1, 13);    
    
	System.out.println("Is 2017 1 13 date is leap year or not    :"+date1.isLeapYear());    
    LocalDate date2 = LocalDate.of(2016, 9, 23);    
    System.out.println("Is 2016 9 23 date is leap year or not    :"+date2.isLeapYear());    
	
	boolean a = date1.after(date2);
	 System.out.println("Date d1 comes after " +
                           "date d2: " + a);  
}    
}  
