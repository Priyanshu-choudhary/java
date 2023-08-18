import java.io.*;  
class ThreadJoin extends Thread{
public void run(){
for (int j = 0; j < 10; j++){
try{Thread.sleep(100);  
//System.out.println("The current thread name is: " + Thread.currentThread().getName()); 
 }catch(Exception e){}
System.out.println( j );  
}}}
class ThreadJoinExample{
public static void main (String argvs[]){
ThreadJoin th1 = new ThreadJoin();
ThreadJoin th2 = new ThreadJoin();
ThreadJoin th3 = new ThreadJoin();
ThreadJoin th4 = new ThreadJoin();

th1.start();

try{
//System.out.println("The current thread name is: "+ Thread.currentThread().getName());
th1.join();
}catch(Exception e){}

th2.start();
th3.start();
th4.start();

}
}
