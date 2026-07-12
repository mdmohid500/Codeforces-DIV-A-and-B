package constructivealgorithm.com.practice;

import java.util.*;

public class Solution2224a {
	
	public static void solve(int n, int arr[])
	{
		int countp=0;
		int countn=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
				countn++;
			else
				countp++;
		}
		System.out.println(countp+(countn%2==0?0:1));
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
			}
			solve(n,arr);
		}

	}

}

//5
//0 -1 3 -3 0


