class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int equal = 0;
		int zero = 0;

		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				zero++;
			}
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					equal++;
				}

			}

		}

		answer[0] = lottos.length - zero - equal + 1;
		answer[1] = lottos.length - equal + 1;
		if (answer[0] == 7) {
			answer[0] = 6;
		}
		if (answer[1] == 7) {
			answer[1] = 6;
		}
		return answer;
	}
}