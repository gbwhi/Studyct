class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=numbers.length-1; i<j; j--){
                if(answer < numbers[i]*numbers[j]){
                    answer = numbers[i]*numbers[j];
                }
            }
        }
        
        
        return answer;
    }
}