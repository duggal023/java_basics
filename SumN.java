import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		int n =s.nextInt();
		int i=1;
		int sum=0;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("the final sum is "+sum);
	}
}
