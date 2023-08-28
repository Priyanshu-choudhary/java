// This is a program to demonstrate Assertions in Java.  
 class Example {  
    public static void main(String[] args)  
    {  
        int age = 19;  
        // using assert keyword on two expressions  
        assert age <= 18 : " you cannot have a license ";  
        System.out.println(" Age of the person is " + age);  
    }  
}
