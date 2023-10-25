class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int idx=0;
        int c=0;
        
        for(int i =0 ; i<finished.length ; i++){
            if(finished[i]==false){
                idx++;
            }
        }
        String[] answer = new String[idx];
        
        for(int i =0 ; i<finished.length ; i++){
            if(finished[i]==false){
                answer[c] = todo_list[i];
                c++;
            }
        }
        
        return answer;
    }
}