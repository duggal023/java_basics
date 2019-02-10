package lec4;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		printarms(min, max);
	}

	public static int nod(int n) {
		int c = 0;
		while (n != 0) {
			c++;
			n /= 10;
		}
		return c;

	}

	public static boolean isArm(int n, int nod) {
		int ar = 0;
		int t = n;
		while (n != 0) {
			ar += (int) Math.pow(n % 10, nod);
			n /= 10;

		}
		if (ar == t)
			return true;
		else
			return false;
	}

	public static void printarms(int n, int m) {
		for (int i = n; i <= m; i++) {
			if (isArm(i, nod(i)))
				System.out.println(i);
		}
	}

}
