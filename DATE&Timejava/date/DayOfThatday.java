import java.time.*;  
import java.time.DayOfWeek;  
    
class DayOfWeekExample5  
{  
    public static void main(String ar[])  
    {  
        LocalDate localDate = LocalDate.of(2021, Month.SEPTEMBER, 13);  
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
        System.out.println("Day of the Week on" + " 13th September 2021 - " + dayOfWeek.name());  
        int val = dayOfWeek.getValue();  
        System.out.println("Int Value of " + dayOfWeek.name() + " - " + val);  
	LocalDate todayDate =LocalDate.now();
	DayOfWeek weektoday = DayOfWeek.from(todayDate); 
	System.out.println("Day of the Week on" + " today - " + weektoday.name());
    }  
}  
