class Solution {
    public int[] solution(int[] arr) {
        int a = arr.length;
        int b = 1;
        while(b<a){
            b *= 2;
        }
        
        
        int[] answer = new int[b];
        
        for(int i=0; i<arr.length ; i++){
            answer[i] = arr[i];
        }
        
        
        return answer;
    }
}