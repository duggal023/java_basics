package lec3;

import java.util.Scanner;

public class binarytodecimal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mu = 0;
		int ans = 0;
		while (n != 0) {
			ans += n % 10 * Math.pow(2, mu++);
			n /= 10;
		}
		System.out.println(ans);
	}
}
