package constructivealgorithm.com.practice;
import java.util.*;
public class Solution2205a {
	public static void solve(int n,int arr[])
	{
		int targt=0;
if(arr[0]==n)
{
	
}
else
{
	for(int i=0;i<n;i++)
	{
		if(arr[i]==n)
		{
			targt=i;
			break;
		}
	}
	
	int tem=arr[targt];
	arr[targt]=arr[0];
	arr[0]=tem;
	
}
for(int i=0;i<n;i++)
{
	System.out.print(arr[i]+" ");
}


		
	
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
   int  t=s.nextInt();
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
