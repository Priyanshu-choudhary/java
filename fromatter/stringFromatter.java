import java.util.*;
class stringFromatter{
public static void main(String[] args){
 
//%s or %S For string    
String s = "hello";
System.out.println(String.format("this is message %s",s));

//%b or %B For boolean
boolean b=true;
System.out.println(String.format("bollean %b",b));

//%c or %C For boolean
char c='g';
System.out.println(String.format("charecter %c",c));

//‘d’ – for decimal number ,‘o’ – for octal number,‘X’ or ‘x’ – for hexadecimal number
System.out.println( String.format("The number 25 in decimal = %d", 25));


// we can use 1$ and 2$  to specify the number of an argument explicitly
System.out.println(String.format("Hello %2$s, welcome to %1$s !","Baeldung", "Folks"));

// use %% to print '%'
System.out.println(String.format("John scored 90%% in Fall semester"));
}
}
