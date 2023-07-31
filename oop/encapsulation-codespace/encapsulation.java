 class encapsulation{
 public static void main (String[] args){
    encapsulation obj = new  encapsulation();
    Employee doctor = new  Employee();
    doctor.empId=7;
    
    System.out.println(doctor.empId);
    System.out.println(doctor.empName);
    System.out.println(doctor.empSalery);
    
    doctor.empId=156;
    doctor.empName="choudhary shahab";
    doctor.empSalery=1565166;
    System.out.println(doctor.empId);
    System.out.println(doctor.empName);
    System.out.println(doctor.empSalery);
    
}
}