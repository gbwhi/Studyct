class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int start = 0;

        // 문자열을 처음부터 끝까지 반복하면서 패턴이 등장하는 횟수를 세기
        while (start <= myString.length() - pat.length()) {
            if (myString.substring(start, start + pat.length()).equals(pat)) {
                count++;
                start ++;
            } else {
                start++;
            }
        }

        return count;
    }
}