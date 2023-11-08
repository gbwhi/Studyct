import java.util.Arrays;
import java.util.Collections;


class Solution {
    public long solution(long n) {
        long answer = 0;
        String aa = "";
        String a = Long.toString(n);
        String[] arr = a.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0 ;i<arr.length;i++) {
        	aa += arr[i];
        }
        
        answer = Long.parseLong(aa);
        return answer;
    }
}