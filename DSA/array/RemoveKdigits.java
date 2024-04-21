import java.lang.Math;
public class RemoveKdigits {
    public static void main(String[] args) {
        String s="1432219";
        int k=3,num=0,cnt=0,j=1,j2=0;
        j=(int)Math.pow(10, s.length()-1);
       
        for (int i2 = 0; i2 < s.length()-k; i2++) {
                for (int i = 0; i < s.length(); i++) {
                
                    int n=Integer.parseInt(String.valueOf(s.charAt(j)));
                   
                    num=num+(n*j);
                    j/=10;
               // System.out.println(n);
                }
              System.out.println(num);
    }
       
    }
}
//1232324
//3---->2324