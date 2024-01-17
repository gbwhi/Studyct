class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int a = 0;
        int b= 0;
        
        for(int i = 0 ; i < 4 ; i++){
            if(dots[0][0]!=dots[i][0]){
                a =dots[0][0]-dots[i][0];
                break;
            }
        }
        for(int i = 0 ; i < 4 ; i++){
            if(dots[0][1]!=dots[i][1]){
                b =dots[0][1]-dots[i][1];
                break;
            }
        }
        if(a*b<0){
            answer = -1*a*b;
        }else answer = a*b;
        
        
        return answer;
    }
}