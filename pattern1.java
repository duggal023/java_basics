
/*
 * pattern : 
 * 
 *   *  
 *  *** 
 * *****
 *  ***
 *   *
 */

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int number = sc.nextInt();
	        int count = number - 1;
	        for (int k = 1; k <= number; k++) {
	            for (int i = 1; i <= count; i++)
	                System.out.print(" ");
	            count--;
	            for (int i = 1; i < 2 * k - 1; i++)
	                System.out.print("*");
	            System.out.println();
	        }
	        count = 1;
	        for (int k = 1; k < number - 1; k++) {
	            for (int i = 1; i <= count; i++)
	                System.out.print(" ");
	            count++;
	            for (int i = 1; i <= 2 * (number - k) - 1; i++)
	                System.out.print("*");
	            System.out.println();
		}
	}
}