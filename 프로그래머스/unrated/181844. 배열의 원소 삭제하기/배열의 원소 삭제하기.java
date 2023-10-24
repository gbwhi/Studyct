import java.util.List;
import java.util.ArrayList;

class Solution {
 public int[] solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> answer1 = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			answer1.add(arr[i]);
		}

		for (int j = 0; j < delete_list.length; j++) {
            if(answer1.contains(delete_list[j])){
                answer1.remove(answer1.indexOf(delete_list[j]));
            }
                
                
		}
		
		int[] answer = new int[answer1.size()];
		
		for(int i = 0 ; i <answer1.size() ; i++) {
			answer[i] = answer1.get(i);
		}
		
		
		
		

		return answer;
	}
}