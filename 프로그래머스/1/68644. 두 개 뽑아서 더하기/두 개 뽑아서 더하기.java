import java.util.Arrays;

class Solution {

	   public static int[] solution(int[] numbers) {
	     int[] answer = {};
	        int index = 0;
	        
	        int[] arr = new int[numbers.length*(numbers.length-1)/2];
	        for(int i = 0 ; i<numbers.length ; i++) {
	    	   for(int j = i+1 ; j<numbers.length ; j++) {
	    		   
	    		   arr[index++] = numbers[i]+numbers[j];
	    	   }
	       }
	       
	      
	        
	       Arrays.sort(arr);
	       
	      answer = Arrays.stream(arr).distinct().toArray();
	      
//	      int[] answerNew = new int[(answer.length)-1];
//	      
//	      for(int i=0 ;i<(answer.length)-1; i++) {
//	    	 answerNew[i] = answer[i+1];
//	      }
	      
	      
//	       int size = answer.length;
//	       int[] finalAnswer = new int[size];
//	       int idx = 0;
//	       for(int i : answer) {
//	    	   if(i == 0) {
//	    		   continue;
//	    	   }u
//	    	   finalAnswer[idx++] = i;
//	       }
	       
	       
	       
//	       List<String> answer = new ArrayList<>(Arrays.asList(arr));
//	       answer.remove("0");
	       
	       
	        return answer;
	        
	    }
	}