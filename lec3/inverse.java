package lec3;

import java.util.Scanner;

public class inverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int i = 1;
		while (n != 0) {
			int re = n % 10;
			ans += i * Math.pow(10, re-1);
			n/=10;
			i++;
		}
		System.out.println(ans);
	}
}
