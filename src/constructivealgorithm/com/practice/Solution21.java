package constructivealgorithm.com.practice;

import java.util.*;

public class Solution21 {
    public static void solve(int n, int k, String name) {
       
        if (n - k < k) {
            System.out.println("-1");
            return;
        }

        int flips = 0;

       
        for (int i = 0; i < k; i++) {
            if (name.charAt(i) == 'L') {
                flips++;
            }
        }

        
        for (int i = n - k; i < n; i++) {
            if (name.charAt(i) == 'R') {
                flips++;
            }
        }

        System.out.println(flips);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String name = sc.next(); 
                
                solve(n, k, name);
                t--;
            }
        }
        sc.close();
    }
}