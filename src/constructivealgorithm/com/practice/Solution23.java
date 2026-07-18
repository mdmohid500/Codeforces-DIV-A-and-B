package constructivealgorithm.com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Solution23 {
	public static void solve(int n, int c, long  arr[])
	{
		Arrays.sort(arr);
		long sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum += (arr[i] - c);
		}
        
		
		for(int i = 0; i < n / 2; i++)
		{
			if(c > arr[i]) {
				sum += (c - arr[i]);
            } else {
                break; 
            }
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		if (s.hasNextInt()) {
			int t = s.nextInt();
			while(t-- > 0)
			{
				int n = s.nextInt();
				int c = s.nextInt();
				long  arr[] = new long [n];
				for(int i = 0; i < n; i++)
				{
					arr[i] = s.nextLong();
				}
				solve(n, c, arr);
			}
		}
		s.close();
	}
}