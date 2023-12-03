import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> dap = new ArrayList<>();
        dap.add(n);
        while(n>1){
            if(n%2==0){
                n=n/2;
                dap.add(n);
                
            } else {
                n=(3*n+1);
                dap.add(n);
            }
        }
        int[] answer = new int[dap.size()];
        for(int i=0; i<dap.size();i++){
            answer[i]=dap.get(i);
        }
        
        return answer;
    }
}