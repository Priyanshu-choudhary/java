import java.io.*;
class employee{

int salery;
int age;
String name;
String POST;
	
	public employee(){
	System.out.println("employee detail");
	}
  		public void emname(String emname){
		this.name=emname;
		}
		
		public void emsalery(int emsalery){
		salery=emsalery;
		}
		
		public void emPOST(String emPOST){
		this.POST=emPOST;
		}
		public void emage(int emage){
		age=emage;
		}
	
		public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
		System.out.println("Designation:" + POST );
        System.out.println("Salary:" + salery );
		
   }
	
	public static void main (String[] args){
	 	employee emone= new employee();
 		employee emtwo= new employee();
		
		emone.emname("yadi");
		emone.emPOST("intern");
		emone.emsalery(10000);
		emone.emage(20);
		emone.printEmployee();
		
		emtwo.emname("priyanshu");
		emtwo.emPOST("junior");
		emtwo.emsalery(100000);
		emtwo.emage(21);
		emtwo.printEmployee();

	}
}


