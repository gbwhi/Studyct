import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int count = 0;
		char[] arr = S.toCharArray();
		
		
		for(int i=0; i<S.length();i++) {
		if(arr[i] == 'A') {
		arr[i] = 3	;
		count += 3;
		} 
		else if(arr[i] == 'B') {
			arr[i] = 3	;
			count += 3;
			} 
		else if(arr[i] == 'C') {
				arr[i] = 3;
				count += 3;
			} 
		else if(arr[i] == 'D') {
			arr[i] = 4;
			count += 4;
		} 
		else if(arr[i] == 'E') {
			arr[i] = 4;
			count += 4;
		} 
		else if(arr[i] == 'F') {
			arr[i] = 4;
			count += 4;
		} 
		else if(arr[i] == 'G') {
			arr[i] = 5;
			count += 5;
		} 
		else if(arr[i] == 'H') {
			arr[i] = 5;
			count += 5;
		} 
		else if(arr[i] == 'I') {
			arr[i] = 5;
			count += 5;
		} 
		else if(arr[i] == 'J') {
			arr[i] = 6;
			count += 6;
		} 
		else if(arr[i] == 'K') {
			arr[i] = 6;
			count += 6;
		} 
		else if(arr[i] == 'L') {
			arr[i] = 6;
			count += 6;
		} 
		else if(arr[i] == 'M') {
			arr[i] = 7;
			count += 7;
		} 
		else if(arr[i] == 'N') {
			arr[i] = 7;
			count += 7;
		} 
		else if(arr[i] == 'O') {
			arr[i] = 7;
			count += 7;
		} 
		else if(arr[i] == 'P') {
			arr[i] = 8;
			count += 8;
		} 
		else if(arr[i] == 'Q') {
			arr[i] = 8;
			count += 8;
		} 
		else if(arr[i] == 'R') {
			arr[i] = 8;
			count += 8;
		} 
		else if(arr[i] == 'S') {
			arr[i] = 8;
			count += 8;
		} 
		else if(arr[i] == 'T') {
			arr[i] = 9;
			count += 9;
		} 
		else if(arr[i] == 'U') {
			arr[i] = 9;
			count += 9;
		} 
		else if(arr[i] == 'V') {
			arr[i] = 9;
			count += 9;
		} 
		else if(arr[i] == 'W') {
			arr[i] = 10;
			count += 10;
		} 
		else if(arr[i] == 'X') {
			arr[i] = 10;
			count += 10;
		} 
		else if(arr[i] == 'Y') {
			arr[i] = 10;
			count += 10;
		} 
		else if(arr[i] == 'Z') {
			arr[i] = 10;
			count += 10;
		} 
		
		
		}
		System.out.println(count);
		
	}

}