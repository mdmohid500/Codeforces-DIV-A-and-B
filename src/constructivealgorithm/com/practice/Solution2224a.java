package constructivealgorithm.com.practice;

import java.util.*;

public class Solution2224a {
	
	public static void solve(int x, long a[])
	{
		 
		 for(int i = x-2;i>=0;i--){
	            if(a[i+1]>0){
	                a[i]+=a[i+1];
	            }
	        }
	        int c = 0;
	        for(long i:a){
	                if(i>0)c++;
	        }
		
		System.out.println( c);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			long arr[]=new long[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
			}
			solve(n,arr);
		}

	}

}



