import java.util.*;
import java.text.*;
class DateDemo {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date todaydate = new Date();

      // display time and date using toString()
      System.out.println(todaydate.toString());
	  SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss a zzz");
      System.out.println(ft.format(todaydate));
   }
}
