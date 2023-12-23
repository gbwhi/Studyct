class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numS = num + "";
        String kS = k + "";
        
        if(numS.contains(kS)){
            answer = 0;
        } else {
            answer = -1;
            return answer;
        }
        
        while(num>0){
            if(num%10==k){
                answer = 1;
                num = num/10;
            } else {
                num = num/10;
                answer += 1;
        }
        }
        
        return answer;
    }
}