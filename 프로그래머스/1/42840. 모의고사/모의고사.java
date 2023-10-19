class Solution {
  
	
	
	public int[] solution(int[] answers) {
		int[] answer3 = { 1, 2, 3 };
		int[] answer2 = { 0, 0 };
		int[] answer1 = { 0 };
		int[] su1 = { 1, 2, 3, 4, 5 };
		int[] su2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] su3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int cntsu1 = 0;
		int cntsu2 = 0;
		int cntsu3 = 0;

		for (int i = 0; i < answers.length; i++) {

			if (answers[i] == (su1[i % 5])) {
				cntsu1++;
			}
		}
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == (su2[i % 8])) {
				cntsu2++;
			}
		}
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == (su3[i % 10])) {
				cntsu3++;
			}
		}

		if ((cntsu1 == cntsu2) && (cntsu1 == cntsu3)) {
			answer3[0] = 1;
			answer3[1] = 2;
			answer3[2] = 3;
			answers = answer3;

		} else if ((cntsu1 == cntsu2) && (cntsu1 > cntsu3)) {
			answer2[0] = 1;
			answer2[1] = 2;
			answers =  answer2;
		} else if ((cntsu1 == cntsu2) && (cntsu1 < cntsu3)) {
			answer1[0] = 3;
			answers =  answer1;
		} else if ((cntsu1 == cntsu3) && (cntsu1 > cntsu2)) {
			answer2[0] = 1;
			answer2[1] = 3;
			answers =  answer2;
		} else if ((cntsu1 == cntsu3) && (cntsu1 < cntsu2)) {
			answer1[0] = 2;
			answers =  answer1;
		} else if ((cntsu2 == cntsu3) && (cntsu2 > cntsu1)) {
			answer2[0] = 2;
			answer2[1] = 3;
			answers =  answer2;
		} else if ((cntsu2 == cntsu3) && (cntsu2 < cntsu1)) {
			answer1[0] = 1;
			answers =  answer1;
		} else if ((cntsu1 > cntsu2) && (cntsu1 > cntsu3)) {
			answer1[0] = 1;
			answers =  answer1;
		} else if ((cntsu2 > cntsu3) && (cntsu2 > cntsu1)) {
			answer1[0] = 2;
			answers = answer1;
		} else if ((cntsu3 > cntsu2) && (cntsu3 > cntsu1)) {
			answer1[0] = 3;
			answers =  answer1;
		}
		return answers;

	}
}