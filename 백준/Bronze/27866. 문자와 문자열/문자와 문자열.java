
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
//		System.out.println(S);
		int i = (sc.nextInt()-1);
//		System.out.println(i);
		
		System.out.println(S.substring(i, i+1));
		
		
		
	}

}