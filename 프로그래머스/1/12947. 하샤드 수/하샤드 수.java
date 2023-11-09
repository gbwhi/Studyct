class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int b=x;
        int a= 0;
        while(x>0){
            a = a+ (x%10);
            x = x/10;
        }
        if(b%a==0){
            answer = true;
        } else answer = false;
        
        
        
        return answer;
    }
}