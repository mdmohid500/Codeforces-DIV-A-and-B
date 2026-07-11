package constructivealgorithm.com.practice;
import java .util.*;

public class Solution2231A {
	public static void solve(int n )
	{
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=2*i+1;
		}
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			
			solve(n);
		}

	}

}
