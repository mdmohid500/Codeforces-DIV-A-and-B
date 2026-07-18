package constructivealgorithm.com.practice;
import java .util.*;
public class StoneGame {
	public static void solve(int n, int arr[])
	{
		int left=0;
		int right=n-1;
		int min1=0;
		int min2=0;
		
		int arr1[]=Arrays.copyOf(arr, n);
		Arrays.sort(arr1);
		
		
		while(left<n)
		{
			if(arr[left]==arr1[0])
			{
				min1=left+1;
				break;
			}
			left++;
		}
	
		left = 0; 
		while(left<n)
		{
			if(arr[left]==arr1[n-1])
			{
				min2=left+1;
				break;
			}
			left++;
		}
		
		
		int pos1 = Math.min(min1, min2);
		int pos2 = Math.max(min1, min2);
		
	
		int opt1 = pos2;
		
		// Option 2: Take both from the right side
		int opt2 = n - pos1 + 1;
		
		int opt3 = pos1 + (n - pos2 + 1);
		
		System.out.println(Math.min(opt1, Math.min(opt2, opt3)));	
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr[]=new int [n];
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
			}
			solve(n,arr);
		}
	}
}