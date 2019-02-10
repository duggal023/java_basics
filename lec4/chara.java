package lec4;

import java.util.Scanner;

public class chara {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
//		sc.nextLine();
		if(ch>='a'&&ch<='z')
			System.out.println("Lower Case");
		else if(ch>='A'&&ch<='Z')
			System.out.println("Upper Case");
		else
			System.out.println("Invalid");
		

	}

}
