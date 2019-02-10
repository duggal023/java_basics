package lec4;

import java.util.Scanner;

public class temperatur {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int minf=sc.nextInt();
		int maxf=sc.nextInt();
		int step= sc.nextInt();
		
		for(int t=minf;t<=maxf;t+=step)
		{
			int c=(int)((5.0/9)*(t-32));
			System.out.println(t+"\t"+c);
			
		}
		
	}

}
