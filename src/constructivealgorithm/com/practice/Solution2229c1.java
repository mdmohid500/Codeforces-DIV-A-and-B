package constructivealgorithm.com.practice;

import java.util.*;

public class Solution2229c1 {
	public static void solve(int n, int arr[])
	{
		List<Integer> res=new ArrayList<>();
		int t=0;
		
	for(int i=n-1;i>=0;i--)
	{
		if(t==1)
		{
			arr[i]*=-1;
		}
		if(arr[i]>0)
		{
			res.add(i+1);
			t^=1;
			
		}
		
		
	}
	System.out.println(res.size());
	for(int re:res)
	{
		System.out.print(re+" ");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
