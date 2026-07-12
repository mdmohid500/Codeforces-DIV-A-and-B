package constructivealgorithm.com.practice;

import java.util.*;

public class Solution {
	public static void solve(int n)
	{
		List<Integer>res=new ArrayList<>();
		for(int i=1;i<=n;i+=2)
		{
		res.add(i+1);
		res.add(i);
		}
		for(int i:res)
		{
			System.out.print(i+" ");
		}
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
