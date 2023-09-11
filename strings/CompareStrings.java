class CompareString{
 public static void main(String args[]){
   String s1="Sachin";
   String s2="Sachin";
   String s3="zadi";
   String s4="yadi";
//equals method
   System.out.println(s1.equals(s2));
   System.out.println(s1.equals(s4));
   System.out.println(s1.equalsIgnoreCase(s3));
//compareTo method
   System.out.println(s1.compareTo(s2));
   System.out.println(s1.compareTo(s3));
   System.out.println(s1.compareTo(s4)); 
  System.out.println(s3.compareTo(s4)); 
  System.out.println(s4.compareTo(s3)); 
	}
}


