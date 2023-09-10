class stringFromatter{
public static void main(String[] args){
double value = 4.2352989244d;
assertThat(String.format("%.2f", value)).isEqualTo("4.24");
assertThat(String.format("%.3f", value)).isEqualTo("4.235");
System.out.println("orignal"+value);
System.out.println("after formatter"+String.format("%.2f", value));
}
}
