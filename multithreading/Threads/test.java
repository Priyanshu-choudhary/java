class test1 extends Thtead{
void run(){
 for(int i = 0;i<10;i++){
	Thread.sleep(1000);
	System.out.print(i);
}
}
class test2 extends Thtead{
void run(){
 for(int i = 0;i<10;i++){
	Thread.sleep(1000);
	System.out.print(i);
}
}

class multitasking {
public static void main (String args[]){
	test1 t1 = new test1();
	test2 t2 = new test2();
	t1.start();
	t2.start();
}

}


