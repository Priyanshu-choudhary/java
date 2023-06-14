class dog{
    int age = 0;
	String name ="Bruno";
	
	public dog(){                            //creat constructor
	System.out.println("dog age= "+age);
	}
	
	void Setage(int dage){                  //creat method 
		age=dage;
	}
		
		                                          
	public static void main (String[] args){
	dog mydog= new dog();
   
	System.out.println("dog name= "+mydog.name);
	mydog.Setage(12);                        // call method  
	System.out.println("dog age= "+mydog.age);
	}	 	 
};