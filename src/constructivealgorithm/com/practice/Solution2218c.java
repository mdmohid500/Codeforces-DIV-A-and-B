package constructivealgorithm.com.practice;

import java.util.List;
import java.util.*;

public class Solution2218c {
	
	public static void solve(int n)
	{
		int k=1;
		int j=0;
		List<Integer>res=new ArrayList<>();
		
		for(int i=3*n;j!=3*n;i-=2)
		{
			res.add(i); //9 
			res.add(i-1);//8
			res.add(k++);// 1
			j+=3;
		}
		for(int i:res)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            solve(n);
            
        }


	}

}




