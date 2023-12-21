class Solution {
    public int[] solution(int n) {
        
        int a = 0;
        for(int i =0 ; i<n ; i++){
            if((n%(i+1))==0){
                a++;
            }
        }
        int[] answer = new int[a];
        int b = 0;
        for(int i =0 ; i<n ; i++){
            if((n%(i+1))==0){
                answer[b]=i+1;
                b++;
            }
        }
        
        
        
        
        return answer;
    }
}