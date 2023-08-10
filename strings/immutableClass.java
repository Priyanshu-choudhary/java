public final class Employee  
{    
final String pancardNumber;    
public Employee(String pancardNumber)  
{    
this.pancardNumber=pancardNumber;    
}  
public String getPancardNumber(){    
return pancardNumber;    
}    
}    
public class  immutableClass
{  
public static void main(String ar[])  
{  
Employee e = new Employee("ABC1235454466");  
String s1 = e.getPancardNumber();  
System.out.println("Pancard Number: " + s1);  
}  
}  
