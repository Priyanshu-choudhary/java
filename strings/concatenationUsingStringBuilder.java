public class  concatenationUsingStringBuilder  
{  
    /* Driver Code */  
    public static void main(String args[])  
    {  
        StringBuilder s1 = new StringBuilder("Hello");    //String 1  
        StringBuilder s2 = new StringBuilder(" World"); 
        String test = "test";
	StringBuilder s = s1.append(s2);   //String 3 to store the result  
        System.out.println(s.toString());
	 s = s.append(test);
	 System.out.println(s.toString());  //Displays result  
        int a=78; 
	s = s.append(a);
         System.out.println(s.toString()); 
    }  
}  
