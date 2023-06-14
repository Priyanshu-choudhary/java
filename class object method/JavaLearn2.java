import java.io.*;
import java.util.*;
class JavaLearn2{
public static void main(String af[]) {
int[] a={10,20,30,40};
int[] b =a;
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(b));
b[1]=55;
System.out.println("After change");
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(b));


System.out.println("reminder");
System.out.println(a[1]%3);

}
};
