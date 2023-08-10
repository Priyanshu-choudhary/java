public class StrBuilder  
{  
    /* Driver Code */  
    public static void main(String args[])  
    {  
        StringBuilder s1 = "Hello";    //String 1  
        StringBuilder s2 = " World";    //String 2  
        StringBuilder s = s1.append(s2);   //String 3 to store the result  
        System.out.println(s.toString());  //Displays result  
    }  
}  
