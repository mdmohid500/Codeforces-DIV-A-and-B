package constructivealgorithm.com.practice;

import java.util.Scanner;

public class Sol2211b {
	
	public static void solve(int x,int y)
	{
		if((x+y)%2==0 && Math.abs(x-y)>0)
		{
			System.out.println("2");
			while(y!=0)
			{
				System.out.print("-1"+ " ");
				y--;
				
			}
			while(x!=0)
			{
				System.out.print("1"+" ");
				x--;
			}
		}
		else
		{
			System.out.println("1");
			while(y!=0)
			{
				System.out.print("-1"+ " ");
				
				y--;
			}
			while(x!=0)
			{
				System.out.print("1"+" ");
				x--;
			}
		}
		System.out.println();
	
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
    int y=sc.nextInt(); 
       solve(x,y);
            
        }

	}

}
