import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
//		int[] arr = new int[num];
		int[] arr;
		arr = new int[num];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);

		}

		System.out.println(min + " " + max);
		
		
		/*
		 * 스캐너 bufferedstreamreader 같은걸로 입력 일단 스캐너로한다
		 * 
		 * 입력받고 n개의 어레이생성
		 * 
		 * 배열생성안하고할수있나
		 * 
		 * print ", "
		 * 
		 * printf 써서하기
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}