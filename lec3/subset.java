package lec3;

import java.util.Scanner;

public class subset {
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i = 0 ;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<((int)(Math.pow(2, n)));i++)
		{
			System.out.print("{ ");
			int k=dectobin(i);
			for(int j = 0;j<n;j++)
			{
				int temp = k%10;
				if(temp == 1) {
					System.out.print(arr[j]+" ");
				}
				k/=10;
			}
			System.out.println("}");
		}
			
	}

	public static int dectobin(int k)
	{
		
	
		int n =k; 
		int mul = 0;
		int r = 0;
		while (n != 0) {
			r += (n % 2) * Math.pow(10, mul++);
			n /= 2;
	
		}
		return(r);
	}
}
