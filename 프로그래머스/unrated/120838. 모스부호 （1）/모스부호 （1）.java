class Solution {
    public String solution(String letter) {
        String answer = "";

letter = letter.replace("....","h");
letter = letter.replace(".---","j");
letter = letter.replace("-.--","y");
letter = letter.replace("--..","z");        
letter = letter.replace("..-.","f");
letter = letter.replace(".--.","p");
letter = letter.replace("--.-","q");
letter = letter.replace(".-..","l");
letter = letter.replace("-.-.","c");
letter = letter.replace("-..-","x");
letter = letter.replace("...-","v");
letter = letter.replace("-...","b");
     
        
letter = letter.replace("...","s");
letter = letter.replace("-..","d");
letter = letter.replace("--.","g");
letter = letter.replace("-.-","k");
letter = letter.replace("---","o");
letter = letter.replace("..-","u");
letter = letter.replace(".--","w");
letter = letter.replace(".-.","r");
        
        
letter = letter.replace("..","i");
letter = letter.replace(".-","a");
letter = letter.replace("--","m");
letter = letter.replace("-.","n");
        
        
letter = letter.replace(".","e");
letter = letter.replace("-","t");
        
letter = letter.replace(" ","");
            
answer = letter;
            


        return answer;
    }
}