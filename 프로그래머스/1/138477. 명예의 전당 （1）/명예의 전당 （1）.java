import java.util.Arrays;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
		int[] tempArr = new int[score.length];
		int min = 2000;
        int length = Math.min(k, score.length);
		for (int i = 0; i < length; i++) {
			if (score[i] < min)
				min = score[i];
			    answer[i] = min;
		}			
		for(int i= 0;i <score.length ; i++) {
			tempArr[i] = score[i];
		if(i>= k-1){
            Arrays.sort(tempArr, 0,i+1); 
            answer[i] = tempArr[i-k+1];
        }
        }
		return answer;
	}
}