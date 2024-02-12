class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for( int a = i ; a<=j ; a++){
            
            int temp1 = a;
            while (temp1>0){
               int temp2 = temp1 % 10;
                if(temp2 == k){
                    answer++;
                }
                temp1 /= 10;         
                
                
            }
            
            
            
        }
        
        return answer;
    }
}