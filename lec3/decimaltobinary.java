package lec3;

import java.util.Scanner;

public class decimaltobinary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 0;
		int r = 0;
		while (n != 0) {
			r += (n % 2) * Math.pow(10, mul++);
			n /= 2;

		}
		System.out.println(r);
	}
}
