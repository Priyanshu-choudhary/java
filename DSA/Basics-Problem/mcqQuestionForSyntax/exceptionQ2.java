import java.*;

class exceptionQ2{
public static void main (String args[]){}
 System.out.print("a");
 try {
 System.out.print("b");
 throw new IllegalArgumentException();
 } catch (RuntimeException e) {
 System.out.print("c");
 } finally {
 System.out.print("d");
 }
 System.out.print("e");
}
