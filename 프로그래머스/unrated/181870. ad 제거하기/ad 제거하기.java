        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List; 

class Solution {
    public String[] solution(String[] strArr) {
        int index = 0;
        int a = strArr.length;
       for(int i=0; i<strArr.length ; i++){
       if(strArr[i].contains("ad")){
           a--;
       }
       }
        String[] answer = new String[a];
        
        for(int j=0 ; j<strArr.length ; j++){
            if(strArr[j].contains("ad")){
                
            } else {
                answer[index] = strArr[j];
                index++;
            }
        }
        
        return answer;
        
        
    }
}