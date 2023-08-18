class TestSleepMethod1 extends Thread{    
 public void run(){    
  for(int i=1;i<5;i++){
    try{Thread.sleep(1000);}catch(InterruptedException e){}    
    System.out.print(i);    
  }    
 }    
 public static void main(String args[]){    
  TestSleepMethod1 t1=new TestSleepMethod1();    
  TestSleepMethod1 t2=new TestSleepMethod1();    
         
  TestSleepMethod1 t3=new TestSleepMethod1();    
         
  TestSleepMethod1 t4=new TestSleepMethod1();    
         
  TestSleepMethod1 t5=new TestSleepMethod1();    
         
  TestSleepMethod1 t6=new TestSleepMethod1();    
         
  TestSleepMethod1 t7=new TestSleepMethod1();    
         
  TestSleepMethod1 t8=new TestSleepMethod1();    
         
  TestSleepMethod1 t9=new TestSleepMethod1();    
         
  TestSleepMethod1 t10=new TestSleepMethod1();    
         
  TestSleepMethod1 t11=new TestSleepMethod1();    
         
  TestSleepMethod1 t12=new TestSleepMethod1();    
         
  TestSleepMethod1 t12=new TestSleepMethod1();    
     
  t1.start();    
  t2.start();    
  t3.start();    
  t4.start();    
  t5.start();    
  t6.start();    
  t7.start();    
  t8.start();    
  t9.start();    
  t.start();    
  t2.start();    
  t2.start();    
 }    
}    
