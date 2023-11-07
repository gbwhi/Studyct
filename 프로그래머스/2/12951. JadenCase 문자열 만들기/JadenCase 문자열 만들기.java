class Solution {
	public String solution(String s) {

		s = s.toLowerCase();

		StringBuilder answer = new StringBuilder();

		String[] arr = s.split("");

		char[] arr1 = s.toCharArray();

		if (Character.isLowerCase(arr1[0])) {
			arr[0] = arr[0].toUpperCase();
		}
		//answer = answer.append(arr[0]);

		for (int i = 0; i < s.length()-1; i++) {
			if (arr[i].equals(" ") ) {
				if (Character.isLowerCase(arr1[i + 1])) {
					arr[i + 1] = arr[i + 1].toUpperCase();
				}
			}
		}

		for (int i = 0; i < s.length(); i++) {
			answer = answer.append(arr[i]);
		}

		String answer1 = answer.toString();
		return answer1;
	}
}