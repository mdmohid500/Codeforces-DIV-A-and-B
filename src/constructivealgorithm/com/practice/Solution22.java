package constructivealgorithm.com.practice;

import java.util.Scanner;
import java.util.Arrays;

public class Solution22 {
	
	private static final long UNVISITED = Long.MIN_VALUE;

	public static long solve(int l, int r, long c, long[] arr, long[][] memo) {
		if (l > r) {
			return 0;
		}
		if (l == r) {
			return arr[l] - c;
		}
		if (memo[l][r] != UNVISITED) {
			return memo[l][r];
		}
            
		long ans = arr[l] - c + solve(l + 1, r, c, arr, memo);
		
		for (int k = l + 1; k <= r; k = k + 1) {
			long takePair = Math.max(arr[l], arr[k]) - c 
							+ solve(l + 1, k - 1, c, arr, memo) 
							+ solve(k + 1, r, c, arr, memo);
			
			ans = Math.max(ans, takePair);
		}
		
		return memo[l][r] = ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		for (int tc = 0; tc < t; tc = tc + 1) {
			int n = s.nextInt();
			long c = s.nextLong(); 
			
			long[] arr = new long[n]; 
			for (int i = 0; i < n; i = i + 1) {
				arr[i] = s.nextLong();
			}
			
			long[][] memo = new long[n][n];
			for (int i = 0; i < n; i = i + 1) {
				Arrays.fill(memo[i], UNVISITED);
			}
			
			long res = solve(0, n - 1, c, arr, memo);
			System.out.println(res);
		}
		s.close();
	}
}