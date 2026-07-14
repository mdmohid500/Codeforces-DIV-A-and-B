package constructivealgorithm.com.practice;

import java.util.*;

public class Solution1 {

    static List<Integer> sieve(int limit) {

        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int p = 2; p * p <= limit; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    prime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (prime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    static void solve(int n, List<Integer> primes) {

        if (n + 1 > primes.size()) {
            System.out.println("Increase sieve limit.");
            return;
        }

        for (int i = 0; i < n; i++) {
            long ans = 1L * primes.get(i) * primes.get(i + 1);
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Increase this limit if needed.
        List<Integer> primes = sieve(2000000);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            solve(n, primes);
        }

        sc.close();
    }
}