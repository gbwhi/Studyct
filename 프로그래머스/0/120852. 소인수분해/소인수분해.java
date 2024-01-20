import java.util.Set;

import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
Set<Integer> set = new HashSet<>();
       
        for(int i = 2 ; i<=n ; i++){
        while(n%i==0){
                set.add(i);
                n= n/i;     
                
        }}
        
        int[] answer = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            answer[index++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}
