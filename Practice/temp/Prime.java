

public class Prime {
    public static void main(String[] args) {
        Solution sc=new Solution();
        System.out.println(sc.countPrimes(10));
// System.out.println(sc.isPrime(4));
}
}
class Solution {
    static boolean isPrime(int n)
{
// Corner case
if (n <= 1)
return false;
// Check from 2 to n-1
for (int i = 2; i < n; i++)
if (n % i == 0)
return false;
return true;

  }

  public int countPrimes(int n) {
      int cnt=0;
     for(int i=2;i<n;i++){
      if(isPrime(i)){
          cnt++;
         
      }
     }
      return cnt;
  }

}