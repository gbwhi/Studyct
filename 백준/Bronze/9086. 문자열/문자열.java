
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			String S = sc.next();
//		System.out.println(S);
			int L = S.length();
			System.out.print(S.substring(0, 1));
			System.out.println(S.substring(L - 1, L));

		}

	}

}