class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        int index=0;
        for(int i =0 ; i<numlist.length ; i++){
            if(numlist[i]%n==0){
                cnt++;
            }
            
        }
        int[] answer = new int[cnt];
        
        for(int i =0; i<numlist.length; i++){
           if(numlist[i]%n==0){
                 answer[index]=numlist[i];
               index++;
            }
           
        }
             
        
        
        return answer;
    }
}