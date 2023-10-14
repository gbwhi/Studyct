class Solution {
    public int solution(String my_string, String is_prefix) {
	        int answer = 1;
	        
	        String[] checkMy = my_string.split("");
	        String[] checkPre = is_prefix.split("");
	        
	        for(int i = 0 ; i<is_prefix.length(); i++) {
	        	if(is_prefix.length()>my_string.length()) {
	        		answer =0;
	        		break;
	        	}
	        	else if(!checkMy[i].equals(checkPre[i])){
	        		answer = 0;
	        		break;
	        	}
	        }
	        
	        return answer;
	    }
	}