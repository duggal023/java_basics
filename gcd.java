import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 2 numbers");
		int n=sc.nextInt();
		int nn=sc.nextInt();
		int i=Math.min(n, nn);
		int hcf=0;
		while(i>=1)
		{
			if(n%i==0 && nn%i==0)
				{
				hcf=i;
				break;
				}
			i--;
		}
		System.out.println("The GCD is "+ hcf);

	}

}
