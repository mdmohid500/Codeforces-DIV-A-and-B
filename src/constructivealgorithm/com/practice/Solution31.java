package constructivealgorithm.com.practice;
import java.util.*;

public class Solution31 {
	public static void solve(int n, int k, int m)
	{
		if(k<=m)
		{
			System.out.println("YES");
			
			// Generate and print the good array
			if(k == m) {
				for(int i = 0; i < n; i++) {
					System.out.print(1 + (i == n - 1 ? "" : " "));
				}
			} else {
				int specialElement = m - k + 1;
				for(int i = 0; i < n; i++) {
					if((i + 1) % k == 0) {
						System.out.print(specialElement);
					} else {
						System.out.print(1);
					}
					System.out.print(i == n - 1 ? "" : " ");
				}
			}
			System.out.println();
		}
		else
		{
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t-->0)
	{
		int n=s.nextInt();
		int k=s.nextInt(); 
		int m=s.nextInt(); 
		solve(n,k,m);      
	}

	}

}