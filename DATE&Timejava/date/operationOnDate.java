import java.time.LocalDate;    
class LocalDateExample2 {    
  public static void main(String[] args) { 
	   
    LocalDate date1 = LocalDate.of(2017, 1, 13);    
    
	System.out.println("Is 2017 1 13 date is leap year or not    :"+date1.isLeapYear());    
    LocalDate date2 = LocalDate.of(2016, 9, 23);    
    System.out.println("Is 2016 9 23 date is leap year or not    :"+date2.isLeapYear());    

}    
}  
