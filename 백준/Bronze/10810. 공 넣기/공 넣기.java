
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] basket = new int[N];

		for (int i = 0; i < M; i++) {
//			공을 M번 넣는다
			st = new StringTokenizer(br.readLine(), " ");
			int a = (Integer.parseInt(st.nextToken()) -1);
					int b = Integer.parseInt(st.nextToken());
					int c = Integer.parseInt(st.nextToken());
			for(int j = a ;j < b ;j++) {
				basket[j] = c;
			}

		}
		
		for(int i=0 ; i< basket.length;i++)
			
System.out.print(basket[i] + " ");
	}
}