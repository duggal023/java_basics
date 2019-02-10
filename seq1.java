import java.util.Scanner;

public class seq1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();

		}
		int flag = 0;
		int i;
		for (i = 0; i < n - 1; i++)

		{
			if (s[i + 1] > s[i]) {
				flag = 1;
				break;
			} else
				flag = 0;
		}

		if (flag == 1) {
			for (; i < n - 1; i++) {
				if (s[i] > s[i + 1]) {
					flag = 2;
					break;

				} else
					flag = 0;
			}
		}
		if (i == n - 1) {
			if (flag == 0)
				System.out.println("True");
			else
				System.out.println("False");
		} else
			System.out.println("False");
	}
}
