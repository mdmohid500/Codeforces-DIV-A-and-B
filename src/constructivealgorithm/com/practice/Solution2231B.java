package constructivealgorithm.com.practice;
import java.util.*;
public class Solution2231B {
	public static void solve(int n, int arr[])
	{
		int k=0;
		for(int i=0;i<n-1;i++)
		{
		k=Math.max(k,Math.abs(arr[i]-arr[i+1]));
		}
		for(int i=1;i<n;i++)
		{
			if(arr[i]<arr[i-1])
			{
				arr[i]+=k;
			}
		}
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	int t=s.nextInt();
	while(t-->0)
	{
		int n=s.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		solve(n, arr);
	}
	}

}
