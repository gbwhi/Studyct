class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] arr = new String[number.length()];
        arr = number.split("");
        int[] arrint = new int[number.length()];
        for(int i = 0 ; i<number.length(); i++){
            arrint[i] = Integer.parseInt(arr[i]);
            answer += arrint[i];
            
        }
        answer = answer % 9;
        return answer;
    }
}