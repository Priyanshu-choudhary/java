import java.time.LocalTime;  
class LocalTimeExample6 {  
  public static void main(String[] args) {  
    LocalDate d = LocalDate.of(2020,07,22);  
    System.out.println(d);  
    LocalDate d2 =d.minusDays(2);
    LocalDate d2 =d.minusMounths(5);  
    LocalDate d2 =d.minusYears(5);
    System.out.println(d2);  
  }  
}  
