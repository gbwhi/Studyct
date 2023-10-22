class Solution {
   public int solution(int number, int limit, int power) {
        int[] arr = new int[number];
        int answer = 0;
        int check = 0;
        
        for(int i = 0 ; i<number ; i++){
            check = 0;
            for(int j = 1 ; j*j<=i+1 ; j++){
                if(j*j==(i+1)){
                    check ++;
                }
                else if((i+1)%j==0){
                    check +=2;
                }
                 
                 
            } if(limit<check){
                arr[i] = power;
            } else {  arr[i] = check;
                   }
          
            
            answer += arr[i];
        }
       return answer;
        
   }

}