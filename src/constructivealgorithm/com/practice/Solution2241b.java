package constructivealgorithm.com.practice;

import java.util.*;

public class Solution2241b {
	public static void solve(int n)
	{
		int y=1;
		while(n!=0)
		{
			y*=10;
			n/=10;
		}
		System.out.println(y+1);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			
			solve(n);
		}

	}

}
