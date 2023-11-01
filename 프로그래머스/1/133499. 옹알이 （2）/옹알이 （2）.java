class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
        if(babbling[i].contains("ayaaya") ){
          babbling[i] = "1";  
        } else if(babbling[i].contains("yeye") ){
          babbling[i] = "1";    
        } else if(babbling[i].contains("woowoo") ){
          babbling[i] = "1";    
        } else if(babbling[i].contains("mama") ){
          babbling[i] = "1";    
        } else {
        babbling[i] = babbling[i].replaceAll("aya", " ");
        babbling[i] = babbling[i].replaceAll("ye", " ");
        babbling[i] = babbling[i].replaceAll("woo", " ");
        babbling[i] = babbling[i].replaceAll("ma", " "); 
        babbling[i] = babbling[i].replaceAll(" ", "");
        if(babbling[i].equals("")){
                answer++;
            }
        }
        
        }
        
        
        
        return answer;
    }
}