class Solution {
    public int solution(int n) {
         int answer = 0;
		        
		        String sn = Integer.toString(n);
		        
		       String[] arr = sn.split("");
		        for(int i =0;i<arr.length;i++)
		        {
		            answer = answer + Integer.parseInt(arr[i]);
		         }
		        
		        return answer;
    }
}