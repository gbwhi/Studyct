import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        List<Character> sortedChars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (countMap.get(c) == 1) {
                sortedChars.add(c);
            }
        }
        
        Collections.sort(sortedChars); 
        StringBuilder sb = new StringBuilder();
        for (char c : sortedChars) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}