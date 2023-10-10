

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] arr = my_string.split("");
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i=0 ; i<arr.length;i++) {
	        	sb.append(arr[arr.length-1-i]);
	        	
	        	
	        }
 	        
	        
	        answer = sb.toString();
	        
	        
	        
	        
	        
	        return answer;
	    }
	}
    