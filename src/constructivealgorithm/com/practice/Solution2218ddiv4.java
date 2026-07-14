package constructivealgorithm.com.practice;

import java.util.Scanner;
import java.util.ArrayList;

public class Solution2218ddiv4 {
   
    private static boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Helper to collect the first K primes
    private static ArrayList<Long> getPrimes(int k) {
        ArrayList<Long> primes = new ArrayList<>();
        long current = 2;
        while (primes.size() < k) {
            if (isPrime(current)) {
                primes.add(current);
            }
            current++;
        }
        return primes;
    }

    public static void solve(int n) {
        if (n == 1) {
            System.out.println("1");
            return;
        }
        
     
        ArrayList<Long> primes = getPrimes(n + 1);
        StringBuilder sb = new StringBuilder();
      
        for (int i = 0; i < n; i++) {
            long element = primes.get(i) * primes.get(i + 1);
            sb.append(element).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                solve(n);
            }
        }
        s.close();
    }
}