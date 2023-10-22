class Solution {
public int solution(int n) {
		int answer = 0;
		boolean[] arr = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			arr[i] = true;
		}
		arr[0] = false;
		arr[1] = false;
		for (int i = 2; i <= n; i++) {
			if (arr[i])
				answer++;
			for (int j = i + i; j<= n; j += i) {
				arr[j] = false;
			}

		}

		return answer;

	}
}
    
    
    
    
    
    
    
    
    
    
    
    
    /*         int check = 0;
       int answer = 0;
       
       for(int i = 0 ; i<n ; i++ ){            
       check = 0;
           for(int j = (int)Math.sqrt(i+1) ; j>0; j--){
               if((i+1)%j==0){
                   check ++;
                   if(check>2){
                      break;
                   }
               }
           } if(check == 1){
              answer ++;
           }
       }
      
       
       return answer;
   }
} */