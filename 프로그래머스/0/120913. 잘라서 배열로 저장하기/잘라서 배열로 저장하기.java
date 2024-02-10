class Solution {
    public String[] solution(String my_str, int n) {
         int arrLength = (my_str.length() + n - 1) / n;
        String[] answer = new String[arrLength];
        for(int i = 0 ; i<arrLength ; i++){
           answer[i] = my_str.substring(n*i, Math.min(n * (i + 1), my_str.length()));
        }
        
        return answer;
    }
}
