class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int hap = Integer.parseInt(a+ "" +b);
        
            if(hap>2*a*b){
                answer= hap;
            } else answer = 2*a*b;
        
        
        return answer;
    }
}