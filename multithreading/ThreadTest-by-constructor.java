class ThreadTest-by-constructor implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
ThreadTest-by-constructor m1=new  ThreadTest-by-constructor();  
Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
t1.start();  
 }  
}  
