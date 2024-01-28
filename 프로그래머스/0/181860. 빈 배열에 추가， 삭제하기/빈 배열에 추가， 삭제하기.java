import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i]; j++) {
                    answer.add(arr[i]);
                    answer.add(arr[i]);
                }
            } else {
                int size = answer.size();
                for (int j = 0; j < arr[i]; j++) {
                    if (size > 0) {
                        answer.remove(size - 1);
                        size--;
                    }
                }
            }
            
            
            
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}