class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        rsp = rsp.replaceAll("2","a");
        rsp = rsp.replaceAll("0","b");
        rsp = rsp.replaceAll("5","c");
        rsp = rsp.replaceAll("a","0");
        rsp = rsp.replaceAll("b","5");
        rsp = rsp.replaceAll("c","2");
        
        
        
        
        return rsp;
    }
}