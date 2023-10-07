import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] arr = new int[M];
		
		for(int i = 0 ;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		for (int i = 0; i < N; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = a;j<b; j++) {
				
				int c = arr[j-1] ;
				arr[j-1] = arr[b-1];
				arr[b-1] = c;
				b--;
			}
		
		}
		for(int k=0;k<arr.length;k++)
		System.out.print(arr[k]+ " ");
	}

}
