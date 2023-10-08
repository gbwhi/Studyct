
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ascii = br.readLine();

		char c = ascii.charAt(0);
		System.out.println((int) c);

	}

}