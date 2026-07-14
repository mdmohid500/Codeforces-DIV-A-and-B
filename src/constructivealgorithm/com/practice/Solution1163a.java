package constructivealgorithm.com.practice;

import java.util.Scanner;

public class Solution1163a {
	
	public static void solve(long n1,int z1,long n2, int z2)
	{
		int min=0;
	min=z1>z2?z2:z1;
		
		z1-=min;
		z2-=min;
		if (z1 >= 7) {
		    System.out.println(">");
		    return ;
		} else if (z2 >= 7) {
		    System.out.println("<");
		    return;
		}
		
		
		while(z1!=0)
		{
			n1*=10;
			z1--;
		}
		
		
		while(z2!=0)
		{
		n2*=10;
			z2--;
		}
	
		
		
		if(n1>n2)
		{
			System.out.println(">");
		}
		else if(n1<n2)
		{
			System.out.println("<");
		}
		else
		{
			System.out.println("=");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			long    n1=s.nextLong();
			int zeroCount1=s.nextInt();;
			long n2=s.nextLong();
			int zeroCount2=s.nextInt();
			
			solve(n1,zeroCount1,n2,zeroCount2);
		}

	}

}
