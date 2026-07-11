package constructivealgorithm.com.practice;

import java .util.*;
public class Solution2227c {
	public static void solve(int n, int arr[])
	{
		List<Integer>six=new ArrayList<>();
		List<Integer>two=new ArrayList<>();
		List<Integer>three=new ArrayList<>();
		List<Integer>no=new ArrayList<>();
		List<Integer>res=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				two.add(arr[i]);
				
			}
			else if(arr[i]%3==0)
			{
				three.add(arr[i]);
				
			}
			else if(arr[i]%6==0)
			{
				six.add(arr[i]);
			}
			else
			{
				no.add(arr[i]);
				
			}
			
		}
		for(int i=0;i<six.size();i++)
		{
			res.add(six.get(i));
		}
		for(int i=0;i<two.size();i++)
		{
			res.add(two.get(i));
		}
		for(int i=0;i<no.size();i++)
		{
			res.add(no.get(i));
		}
		for(int i=0;i<three.size();i++)
		{
			res.add(three.get(i));
		}
		for(int i=0;i<res.size();i++)
		{
			System.out.print(res.get(i)+ " ");
		}
		System.out.println();
		
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
//6
//12 7 9 4 18 5
