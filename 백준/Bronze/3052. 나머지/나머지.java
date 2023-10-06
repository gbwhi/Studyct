
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		boolean bl;
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (sc.nextInt()%42);
		}
	
		for (int j= 0 ;j<10; j++) {
			bl = false;
			for (int k=j+1; k<arr.length; k++) {
				if((arr[j])==(arr[k])) {
					bl = true;
				}
				
			}
			if(bl == false) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}

