import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String M = br.readLine();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(M.substring(i,i+1));
//			System.out.println(a);
			sum = sum + a;
		}
System.out.println(sum);
	}

}