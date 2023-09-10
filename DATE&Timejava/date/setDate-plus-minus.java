import java.time.LocalDate;  
class LocalTimeExample6 {  
  public static void main(String[] args) {  
    LocalDate d = LocalDate.of(2020,07,22);  
    System.out.println(d);  
    LocalDate d2 =d.minusDays(2);
    LocalDate d3 =d2.minusMonths(5);  
    LocalDate d4 =d3.minusYears(5);
    System.out.println(d4);  
  }  
}  
