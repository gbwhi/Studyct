
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		2
//		3 ABC
//		5 /HTP

		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int su = sc.nextInt();
			String gs = sc.next();
			for (int j = 0; j < gs.length(); j++) {
				char hj = gs.charAt(j);
				for (int k = 0; k < su; k++) {
					sb = sb.append(hj);
				}

			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
