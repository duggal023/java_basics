import java.util.Scanner;

public class fibo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int i=0;
		int j=1;
		for (int k =0;k<=n;k++)
		{
			
			System.out.println(i);
			int v=i;
			i=j;
			j+=v;
		}
	}
	
}
