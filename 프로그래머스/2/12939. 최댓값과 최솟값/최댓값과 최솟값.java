class Solution {
public String solution(String s) {
		String answer = "";
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		String[] arr = s.split(" ");
		int[] arr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = Integer.parseInt(arr[i]);
		}

		for (int i = 0; i < arr1.length; i++) {
			if (min > arr1[i]) {
				min = arr1[i];
			}
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}

		answer = min + " " + max;
		return answer;
	}
}
