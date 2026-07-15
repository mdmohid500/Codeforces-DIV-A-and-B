package constructivealgorithm.com.practice;

import java.util.*;

public class Solution11 {
	public static void solve(int n, String name )
	{
		int count=0;
		int max=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='#' )
			{
				count++;
			max=Math.max(count, max);
			}
			else
			{
				count=0;
			}
			
		}
		System.out.println((int )Math.ceil((max)/2.0));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t> 0) {
        	
            int n = sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            solve(n,str);
            t--;
            
        }

	}

}
