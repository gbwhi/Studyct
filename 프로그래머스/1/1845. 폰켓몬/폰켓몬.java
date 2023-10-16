import java.util.Arrays;

class Solution {
	 public int solution(int[] nums) {
	 
		 int answer = 0;
         int leng = nums.length;
		 nums = Arrays.stream(nums).distinct().toArray();
        int a = nums.length;
          
		
if(a < leng/2 ) {
answer = a;}
         else {
answer =leng/2;}
         
                     
         
         
		 return answer;
	    
		
	}
	
}
	
   