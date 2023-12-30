import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        
        char[] beforeB = before.toCharArray();
        Arrays.sort(beforeB);
        String befores = new String(beforeB);
        
        char[] beforeA = after.toCharArray();
        Arrays.sort(beforeA);
        String afters = new String(beforeA);
        
        if(befores.equals(afters)){
            answer = 1;
        }
        
        
     
        
        return answer;
    }
}