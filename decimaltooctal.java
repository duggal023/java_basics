
import java.util.*;

public class decimaltooctal {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 0;
		int r = 0;
		while (n != 0) {
			r += (n % 8) * Math.pow(10, mul++);
			n /= 8;

		}
		System.out.println(r);
	}
	
}
