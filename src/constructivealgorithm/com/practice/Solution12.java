package constructivealgorithm.com.practice;

import java.util.*;

public class Solution12 {
	public static void solve(int n, int arr[])
	{
		int curr=0;
		for(int i=0;i<n;i++)
		{
			curr=curr+arr[i];
			int sum=((i+1)*(i+2))/2;
			if(curr<sum)
			{
				System.out.println("NO");
				return ;
			}
			
		}
		System.out.println("YES");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
       int arr[]=new int [n];
       for(int i=0;i<n;i++)
       {
    	   arr[i]=sc.nextInt();
    	   
       }
       solve(n,arr);
            
        }

	}

}

//YES
//NO
//YES
//YES
//YES
//YES
//NO




