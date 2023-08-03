abstract class Bank {
 abstract void info();
}

class Sbi extends Bank{
 void info(){
  System.out.print("abstract Method");
 }
}
