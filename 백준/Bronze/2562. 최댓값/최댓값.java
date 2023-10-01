import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max = 0;
		int count = 0;
//줄로 넣는거기 때문에 for문 안에서 br.readLine()을 해줘야한줄씩 입력이 되고 비교가 된다.
//		while (st.hasMoreTokens()) {
//			int num = Integer.parseInt(st.nextToken());
		
		for(int i =0 ;i<9; i++) {
			int num = Integer.parseInt(br.readLine());
		
			if (num > max) {
				max = num;
				count = i+1; /// i값을 이용해서 숫자를 세기 ++을 쓴다는 생각버리기.
//				StringTokenizer는 한줄로 들어간값을 나눠주는거다. 
//				한줄로 입출력을 하는 것은 반복문 안에 넣어서 해결
				
			}

		}
		System.out.println(max);
		System.out.println(count);
		// 어레이로 담아야하나? > 그럴필요없었다 더 생각해보기.

	}
}