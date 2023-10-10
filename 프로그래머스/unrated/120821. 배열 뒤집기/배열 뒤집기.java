class Solution {
    public int[] solution(int[] num_list) {
       
        
        
        
            int[] answer = new int[num_list.length];
	        
	        int b= num_list.length;
	        for(int i = 0 ;i<b;i++) {
	        	int a = num_list[i];
	        	answer[i] = num_list[b-1]; 	        	
	        	answer[b-1] = a;
	        	
	        	b--;
	        	
//	        	num_list[0] = 5 
//	        			num_list[1] = 2
//	        			num_list[2] = 3
//	        			num_list[3] = 4
//	        			num_list[4] = 5
//	        	
//	        			num_list[4] = 5
//	        			num_list[3] = 4
//	        			num_list[2] = 3
//	        			num_list[1] = 2
//	        			num_list[0] = 1
	        	
	        	
	        }
	        
	        
	        
        
        
        
        return answer;
    }
}