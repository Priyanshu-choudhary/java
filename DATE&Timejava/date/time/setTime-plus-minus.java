import java.time.LocalTime;  
class LocalTimeExample3 {  
  public static void main(String[] args) {  
    LocalTime time1 = LocalTime.of(10,43,12);  
    System.out.println(time1);  

    LocalTime time2=time1.minusHours(2);  
    LocalTime time3=time2.minusMinutes(34);  
    System.out.println("minus hours and min"+time3);  


     time2=time1.plusHours(2);  
     time3=time2.plusMinutes(34);  
    System.out.println("minus hours and min"+time3);
  }  
}  
