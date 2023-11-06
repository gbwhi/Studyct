class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cntp = 0;
        int cnty = 0;
        s= s.toLowerCase();
        int a = s.length();
        String[] arr= s.split("");
        for(int i=0 ; i<s.length();i++) {
        	if(arr[i].equals("p")) {
        		cntp++;
        	}
        }
        for(int i=0 ; i<s.length();i++) {
        	if(arr[i].equals("y")) {
        		cnty++;
        	}
        }
        
        
        if(cntp==cnty) {
        	answer = true;
        } else answer = false;
        
        return answer;
    }
}