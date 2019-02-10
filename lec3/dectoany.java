package lec3;

import java.util.Scanner;

public class dectoany {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int base = sc.nextInt();
		
		int mul = 0;
		int r = 0;
		while (n != 0) {
			r += (n % base) * Math.pow(10, mul++);
			n /= base;

		}
		System.out.println(r);
	}

}
