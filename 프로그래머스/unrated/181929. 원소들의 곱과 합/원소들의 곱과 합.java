class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int gob = 1;
        int sum = 0;
        for(int i = 0 ; i <num_list.length ; i ++ ){
            gob *= num_list[i];
        }
        for(int i = 0 ; i <num_list.length ; i ++ ){
            sum += num_list[i];  
        }
        
        if(gob< sum*sum){
            answer = 1;
        }
        
        
        return answer;
    }
}