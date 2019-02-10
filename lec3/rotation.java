package lec3;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r = sc.nextInt();
		int len = String.valueOf(num).length();
		r %= len;
		while (r < 0)
			r += len;
		
//		for (int i = 1; i <= r; i++) {
//			int k = num % 10;
//			num /= 10;
//			num += k * Math.pow(10, len - 1);
//
//		}
		
		
		int k = num % (int) (Math.pow(10, r));
		num /= Math.pow(10, r);
		num += k * Math.pow(10, len - r);

		System.out.println(num);

	}

}
