import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double max = 0;
		int N = sc.nextInt();
		double[] arr = new double[N];
		double sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
//		System.out.println("맥스" + max);
		for (int i = 0; i < N; i++) {
			sum += arr[i];
		}
//		System.out.println("총합" + sum);
		double answer = (sum / max / N)*100;
		System.out.println(answer);
	}

}