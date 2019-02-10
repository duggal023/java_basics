package lec3;

import java.util.Scanner;

public class anytodecimal {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int base=sc.nextInt();
		int mu = 0;
		int ans = 0;
		while (num != 0) {
			ans += num % 10 *((int) Math.pow(base, mu++));
			num /= 10;
		}
		System.out.println(ans);
	}

}
