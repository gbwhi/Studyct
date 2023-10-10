import java.util.Arrays;

//import java.util.StringTokenizer;



class Solution {
//	
//public static void main(String[] args) {
//	
//	String[] strlist = {"We", "are", "the", "world!"};
//			
//	System.out.println(Arrays.toString(solution(strlist)));
	
	
//	
//}	
	
    public int[] solution(String[] strlist) {
    	
        int[] answer = new int[strlist.length];
        
        
        for(int i = 0 ;i<strlist.length; i++) {
        	answer[i] =  strlist[i].length();      	
        	
        }
        
        
        
        
        return answer;
    }
}