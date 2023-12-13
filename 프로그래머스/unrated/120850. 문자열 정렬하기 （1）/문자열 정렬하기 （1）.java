import java.util.Arrays;
class Solution {
  	public int[] solution(String my_string) {
		
        int a = 0;
        int b= 0;
		String[] answer1 = my_string.split("");
		
		for (int i = 0; i < answer1.length; i++) {
			if (answer1[i].equals("0")) {
				b++;
			} else if (answer1[i].equals("1")) {
				b++;
			} else if (answer1[i].equals("2")) {
				b++;
			} else if (answer1[i].equals("3")) {
				b++;
			} else if (answer1[i].equals("4")) {
				b++;
			} else if (answer1[i].equals("5")) {
				b++;
			} else if (answer1[i].equals("6")) {
				b++;
			} else if (answer1[i].equals("7")) {
				b++;
			} else if (answer1[i].equals("8")) {
				b++;
			} else if (answer1[i].equals("9")) {
				b++;
			}
		}
		
		
		int[] answer = new int[b];
        for (int i = 0; i < answer1.length; i++) {
			if (answer1[i].equals("0")) {
				answer[a] = Integer.parseInt(answer1[i]);
				a++;
			} else if (answer1[i].equals("1")) {
				answer[a] = Integer.parseInt(answer1[i]);
				a++;
			} else if (answer1[i].equals("2")) {
				answer[a] = Integer.parseInt(answer1[i]);
				a++;
			} else if (answer1[i].equals("3")) {
				answer[a] = Integer.parseInt(answer1[i]);
				a++;
			} else if (answer1[i].equals("4")) {
				answer[a] = Integer.parseInt(answer1[i]);
				a++;
			} else if (answer1[i].equals("5")) {
				answer[a] = Integer.parseInt(answer1[i]);
				a++;
			} else if (answer1[i].equals("6")) {
				answer[a] = Integer.parseInt(answer1[i]);
				a++;
			} else if (answer1[i].equals("7")) {
				answer[a] = Integer.parseInt(answer1[i]);
				a++;
			} else if (answer1[i].equals("8")) {
				answer[a] = Integer.parseInt(answer1[i]);
				a++;
			} else if (answer1[i].equals("9")) {
				answer[a] = Integer.parseInt(answer1[i]);
				a++;
			}
		}
        Arrays.sort(answer);
		return answer;
	}

}