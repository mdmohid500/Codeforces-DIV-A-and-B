package constructivealgorithm.com.practice;

import java.util.Scanner;

public class Solution2208a {

	public static void solve(int n, int arr[][], int count [])
	{
		boolean ok=true;
		for(int i=0;i<n*n;i++)
        {
        	if(count[i]>=n*n-n)
        	{
        		System.out.println("no");
        		ok=false;
        		break;
        	}
        }
		if(ok)
        System.out.println("yes");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t> 0) {
        	
            int n = sc.nextInt();
            sc.nextLine();
            int arr[][]=new int [n][n];
            int count []=new int [n*n];
            for(int i=0;i<n;i++)
            {
            	for(int j=0;j<n;j++)
            	{
            arr[i][j]=sc.nextInt();
            count[arr[i][j]]++; 
            }
            }
            
 
            
            solve(n, arr, count);
            t--;
            
        }


	}

}
