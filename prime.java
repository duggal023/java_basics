import java.util.Scanner;

//check if the number is prime
public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1, c = 0;
		while (i <= n) {
			if (n % i == 0)
				c++;
			i++;
		}
		
		if (c <= 2)
			System.out.println("The given number is prime");
		else
			System.out.println("The given number is not prime");

	}

}
