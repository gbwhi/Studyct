class Solution {
	public int solution(String dartResult) {

		int answer = 0;
		int idx = -1;

		String[] arr = dartResult.split("");
/*		String answer1 = dartResult.replaceAll("S", "");
		answer1 = answer1.replaceAll("D", "");
		answer1 = answer1.replaceAll("T", "");
		answer1 = answer1.replaceAll("\\*", "");
		answer1 = answer1.replaceAll("\\#", "");
		String[] score1 = answer1.split(""); //// 10이 1,0으로 나눠지니까 코드가 틀리게나옴 */
		int[] score = new int[3];

		for (int i = 0; i < dartResult.length(); i++) {
			if (arr[i].matches("[0-9]")) {
				idx++;
				score[idx] = Integer.parseInt(arr[i]);
                
				if (arr[i + 1].equals("0")) {
					score[idx] = 10;
					i++;
				}
			}
			if (arr[i].equals("D")) {
				score[idx] = (score[idx]) * (score[idx]);				
			} else if (arr[i].equals("T")) {
				score[idx] = (score[idx]) * (score[idx]) * (score[idx]);				
			} else if (arr[i].equals("S")) {
				score[idx] = score[idx];				
			} else if (arr[i].equals("*")) { /// 여기도 위 replaceAll할때 //*했더니 //*를 하나로 인식해서 계산오류
				if (idx == 0) {
					score[idx] = score[idx] * 2;
				} else {
					score[idx] = (score[idx]) * 2;
					score[idx - 1] = (score[idx - 1]) * 2;
				}

			} else if (arr[i].equals("#")) {
				score[idx] = -1 * score[idx];
			}

		}
		answer = score[0] + score[1] + score[2];
		return answer;
	}
}