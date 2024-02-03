import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>();
        for(int i =0 ; i<intStrs.length; i++){
        if(Integer.parseInt(intStrs[i].substring(s,s+l))>k){
                        arr.add(Integer.parseInt(intStrs[i].substring(s,s+l)));
        }
            
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0 ; i<arr.size();i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}