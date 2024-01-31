class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[arr.length];
        for(int i = 0 ; i<queries.length; i++){
            for(int j = 0 ; j<queries[i].length; j++){
                if(queries[i][j]==queries[i][0]){
                    answer[queries[i][0]] = arr[queries[i][1]];
                } else {
                     arr[queries[i][1]] = arr[queries[i][0]];
                }
            }
          arr[queries[i][0]]  = answer[queries[i][0]];
            
        }
        
        return arr;
    }
}