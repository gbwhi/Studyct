class Solution {
    public int[] solution(String myString) {
        
        String[] answers = myString.split("x", -1);
        int[] answer = new int[answers.length];
        for(int i = 0 ; i < answers.length ; i ++){
        answer[i] = answers[i].length();    
        }
        
        
        return answer;
    }
}

