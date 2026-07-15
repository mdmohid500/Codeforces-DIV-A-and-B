package constructivealgorithm.com.practice;

import java.util.Scanner;

public class Solution2210a {
	public static void solve(int n)
	{
		for(int i=n;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t> 0) {
        	
            int n = sc.nextInt();
            sc.nextLine();
            solve(n);
            t--;
            
        }

	}

}
