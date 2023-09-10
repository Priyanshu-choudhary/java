import java.util.*;
class stringFromatter{
public static void main(String[] args){
double value = 4.2352989244d;
System.out.println("orignal"+value);
System.out.println("after formatter"+String.format("%.2f", value));
}
}
