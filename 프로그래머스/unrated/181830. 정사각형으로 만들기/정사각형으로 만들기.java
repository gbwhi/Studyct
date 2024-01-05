class Solution {
    public int[][] solution(int[][] arr) {
        int arr1 = 0 ;
        if(arr.length> arr[0].length){
            arr1 = arr.length;
        } else arr1 = arr[0].length;
        
        int[][] arrk = new int[arr1][arr1];
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j < arr[0].length; j++){
               arrk[i][j] = arr[i][j];
            }
        }
        
        return arrk;
    }
}