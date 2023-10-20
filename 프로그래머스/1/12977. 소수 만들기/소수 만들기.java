import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
    int answer = 0;
		int index = 0;
		int notSosu = 0;

		int[] n = new int[((nums.length * (nums.length - 1) * (nums.length - 2)) / 6)];

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					n[index++] = nums[i] + nums[j] + nums[k];
				}
			}
		}

		

		for (int i = 0; i < n.length; i++) {
			notSosu = 0;
			for (int k = (n[i] ); k > 0; k--) {
				if ((n[i] % k) == 0) {
					notSosu++;
				}
			}
			if (notSosu == 2) {
				answer++;
			}

		}

		return answer;
	}
}