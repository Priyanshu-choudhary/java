class test1 extends Thread{
public void run(){
 for(int i = 0;i<10;i++){
	try {
 		 Thread.sleep(1000);
	} catch (InterruptedException e) {Thread.currentThread().interrupt();}
	
	System.out.print(i);
}}}
class test2 extends Thread{
public void run(){
 for(int i = 100;i<110;i++){
	try {
 		 Thread.sleep(1000);
	} catch (InterruptedException e) {Thread.currentThread().interrupt();}
	
	System.out.print(" P ");
}}}

class multitasking {
public static void main (String args[]){
	test1 t1 = new test1();
	test2 t2 = new test2();
	t1.start();
	t2.start();
	t1.setPriority(10);  
	t2.setPriority(9);  
/*
t1.start();

try
{ t1.join();
}catch(Exception e){System.out.println("The exception has been caught " + e);  
}


t2.start();


try
{
t2.join();
}catch(Exception e){System.out.println("The exception has been caught " + e);}  
*/
}

}

