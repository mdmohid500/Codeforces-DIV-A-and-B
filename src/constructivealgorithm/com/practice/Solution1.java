package constructivealgorithm.com.practice;

import java.util.*;

public class Solution1 {
	
	public static void solve(long  n)
	{
	
		if(n==1)
		{
			System.out.println("1");
		}
		else if(n==2)
		{
			System.out.print("-1");
		}
		else if(n==3)
		{
			System.out.print(1+" "+2+" "+3);
		}
		else
		{
			System.out.print(1+" "+2+" "+3+" ");
			long  k=3;
			for(long  i=4;i<=n;i++)
			{
				k=k*2;
			System.out.print(k+" ");	
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			long  n=s.nextLong();
			
			solve(n);
		}


	}

}
