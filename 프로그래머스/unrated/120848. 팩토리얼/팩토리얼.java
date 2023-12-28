class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 1 ; 
        while(num<=n){
            num = num * answer;
                answer ++;
        }
        answer = answer-2;
        return answer;
    }
}