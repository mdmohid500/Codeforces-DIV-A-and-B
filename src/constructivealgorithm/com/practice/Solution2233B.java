package constructivealgorithm.com.practice;
//
//import java.util.*;
//
//public class Solution2233B {
//
//	public static void main(String[] args) {
//		
//		/*
//		 * 
//		 * 3
//3
//4
//5
//
//3
//3
//4
//5
//OutputCopy
//1 1 2 1 2 3 1 3 2 2 3 3
//1 4 3 4 4 3 3 1 2 1 2 3 4 2 2 1 
//5 3 2 4 1 2 2 4 4 5 3 5 2 1 3 1 5 4 1 3 
//		 * 
//		 * */
//		Scanner s=new Scanner(System.in);
//		int t=s.nextInt();
//	while(t-->0);
//		{
//			int k=s.nextInt();
//			List<Integer> res=new ArrayList<>();
//			for(int i=1;i<=k;i++)
//			{
//				res.add(i);
//				res.add(i);
//			}
//			
//			for(int i=1;i<=k;i++)
//			{
//				res.add(i);
//			
//			}
//			for(int i=k;i>=1;i--)
//			{
//				res.add(i);
//			
//			}
//			  if (k % 2 == 1) {
//	                int idx1 = 3 * k;
//	                int idx2 = 3 * k + 1;
//
//	                int temp = res.get(idx1);
//	                res.set(idx1, res.get(idx2));
//	                res.set(idx2, temp);
//	            }
//		System.out.println(res);
//		
//		
//		}
//
//	}
//
//}
import java.util.*;

public class Solution2233B {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        if (n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {
                sb.append(i + 2).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 1).append(" ");
            }
        } else {
            sb.append("3 3 2 1 1 2 1 2 2 3 1 3 ");

            for (int i = 3; i < n; i += 2) {
                sb.append(i + 2).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 1).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}