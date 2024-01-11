class Solution {
    public int[] solution(int[] arr) {
        
        int first = 0;
        int last = 0;
        int index = 0 ;
        

         boolean containsTwo = false;
        
        for (int number : arr) {
            if (number == 2) {
                containsTwo = true;
                break;
            }
        }
        
        if(containsTwo == false){
            int[] answer = {-1};
            return answer;
        }
        
        
        
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==2){
                first = i;
                break;
            }
        }
        
        for(int i=arr.length-1 ; i>=0 ;i--){
            if(arr[i]==2){
                last = i;
                break;
            }
        }
        
        int[] answer = new int[last-first+1];
        
        for(int i = first ; i<=last; i++)
        {
            answer[index] = arr[i];
            index++;
                                
        }
       
        
        
       
        
        return answer;
    }
}