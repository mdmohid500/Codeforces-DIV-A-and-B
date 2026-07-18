package constructivealgorithm.com.practice;

import java.util.*;

public class ZeroSolution {
	public static void solve(int n, int arr[]) {
	    int sum = 0;
	    for (int i : arr) {
	        sum += i;
	    }
	    
	        if (n % 2 != 0) {
	        System.out.println("NO");
	    } 
	    else if (Math.abs(sum) % 4 == 0) {
	        System.out.println("YES");
	    } 
	    else {
	        System.out.println("NO");
	    }
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

