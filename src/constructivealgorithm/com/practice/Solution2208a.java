package constructivealgorithm.com.practice;
import java.util.Scanner;

public class Solution2208a {

    public static void solve(int n, int count[]) {
        boolean ok = true;
        // Loop through all possible color values (from 1 to n*n)
        for (int i = 1; i <= n * n; i++) {
            // A single color cannot exceed (n*n - n)
            if (count[i] > (n * n - n)) {
                System.out.println("NO");
                ok = false;
                break;
            }
        }
        if (ok) {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            
            // Size must be n*n + 1 to safely handle color values up to n*n
            int count[] = new int[n * n + 1];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int val = sc.nextInt();
                    count[val]++; 
                }
            }
            
            solve(n, count);
            t--;
        }
        sc.close();
    }
}