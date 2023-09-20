// JAVA program to check the given number
// is prime or not
import java.util.*;
class GFG {

    static boolean isPrime(int n) {
        // since 2 and 3 are prime
        if (n == 2 || n == 3)
            return true;

        // if n<=1 or divided by 2 or 3 then it can not be prime
        if (n <= 1 || n % 2 == 0 || n % 3 == 0)
            return false;

        // To check through all numbers of the form 6k ± 1
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }

    // Driver Program
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (isPrime(a))
                System.out.println("prime");
            else
                System.out.println("not prime");
        }
    }
}

// This code is contributed by Ujjwal Kumar Bhardwaj
