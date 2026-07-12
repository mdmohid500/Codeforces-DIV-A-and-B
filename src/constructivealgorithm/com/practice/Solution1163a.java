package constructivealgorithm.com.practice;

import java.util.Scanner;

public class Solution1163a {
	
	public static void solve(int n1,int z1,int n2, int z2)
	{
		int min=0;
	min=z1>z2?z2:z1;
		
		z1-=min;
		z2-=min;
		if (z1 >= 7) {
		    System.out.println(">");
		} else if (z2 >= 7) {
		    System.out.println("<");
		}
		
		String s1=n1+"";
		while(z1!=0)
		{
			s1+='0';
			z1--;
		}
		
		String s2=n2+"";
		while(z2!=0)
		{
			s2+='0';
			z2--;
		}
		n1=Integer.parseInt(s1);
		n2=Integer.parseInt(s2);
		
		
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
			int   n1=s.nextInt();
			int zeroCount1=s.nextInt();;
			int n2=s.nextInt();
			int zeroCount2=s.nextInt();
			
			solve(n1,zeroCount1,n2,zeroCount2);
		}

	}

}
