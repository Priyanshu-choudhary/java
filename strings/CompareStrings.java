class Teststringcomparison2{
 public static void main(String args[]){
   String s1="Sachin";
   String s2="Sachin";
   String s3="SACHIN";
   String s4="yadi";

   System.out.println(s1.equals(s2));
   System.out.println(s1.equals(s4));
   System.out.println(s1.equalsIgnoreCase(s3));
 }
}


