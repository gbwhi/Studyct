import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
    int a = score.length;
            int answer = 0;
      Arrays.sort(score);
       
        for(int i = a ; i>m-1 ; i = i-m){
            answer += m*score[i-m];
        }
        
        
        
        return answer;
        
        
        
    }
}