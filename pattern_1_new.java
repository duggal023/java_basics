import java.util.Scanner;

public class pattern_1_new {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i=1;
		int j;
		while (i<= n/2)
		{
			j=1;
			while(j++<=n-i)
			{
				System.out.print(" ");

			}
			j=1;
			while(j++<=i*2-1)
			{
				System.out.print('*');

			}

			System.out.println();
			i++;
		}
		i=n-1;
		while(i>0)
		{
			j=1;
			while(j++<=n-i)
			{
				System.out.print(" ");

			}
			j=1;
			while(j++<=i*2-1)
			{
				System.out.print('*');
			}
			System.out.println();
			i--;
		}

	}
}