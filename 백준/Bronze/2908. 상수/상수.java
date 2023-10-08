import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a, " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int newx = (x % 10) * 100 + ((x % 100) / 10) * 10 + (x / 100);
		int newy = (y % 10) * 100 + ((y % 100) / 10) * 10 + (y / 100);

		if (newx > newy) {
			System.out.println(newx);
		} else {
			System.out.println(newy);
		}

	}
}
