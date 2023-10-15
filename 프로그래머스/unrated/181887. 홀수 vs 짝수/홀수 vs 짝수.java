class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i = 0 ; i < num_list.length ; i++){
            if(i%2==1){
                answer += num_list[i];
            } else if(i%2==0){
                answer -= num_list[i];
            }
            
        }
        if(answer > 0){
            answer = 0;
            for (int i = 0 ; i < num_list.length ; i++){
                  if(i%2==1){
                answer += num_list[i];
            }
            }
          
        }else if(answer < 0){
            answer = 0;
            for(int i = 0 ; i < num_list.length ; i++){
                  if(i%2==0){
                answer += num_list[i];
                  } 
            }
        }     
                else if (answer == 0){
            answer = 0;
             for(int i = 0 ; i < num_list.length ; i++){
                  if(i%2==0){
                answer += num_list[i];
                  }
           }
      
        }
         return answer;
    }
}