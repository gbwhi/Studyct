// 1. 같은걸 찾고  
// 2. 그걸 배열에서 제거
// 3. equal? 이용? 
// 4. 참가자의 array.length -1 만큼 반복 
// 5.  배열에서 1개만 남았을테니 참가자[0] 출력

// ??배열이 두개세개 n개 차이가 나면어떻게하나
// 6.sort 정렬필요
// 7.비교하다가 틀린게 나오면 반복문을 break하고 그값을 출력

import java.util.Arrays;

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				return answer;
			}
		}
		return participant[participant.length - 1];

	}
}
