class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0 ; i<n ; i++){
            answer[i] = (long)x*(i+1); //와 x는 int라 long 오류가 날 수 있다 ㅋㅋㅋ
        }
        return answer;
    }
}