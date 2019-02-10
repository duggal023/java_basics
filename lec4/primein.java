package lec4;

import java.util.Scanner;

public class primein {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		printprime(min, max);

	}

	public static boolean isPrime(int a) {
		if (a == 0 || a == 1)
			return false;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				return false;

		}
		return true;
	}

	public static void printprime(int min, int max) {
		for (int i = min; i <= max; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
	}
}
