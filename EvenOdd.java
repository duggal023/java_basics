import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		if(n%2==0)
			System.out.println("the number "+ n +" is even");
		else
			System.out.println("the number "+ n +" is odd");
		
	}
}
