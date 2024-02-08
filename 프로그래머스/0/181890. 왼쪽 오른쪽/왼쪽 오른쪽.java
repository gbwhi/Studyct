class Solution {
    public String[] solution(String[] str_list) {
        int a = 0;
        int b = 0;
        for(int i=0;i<str_list.length; i++){
            if(str_list[i].equals("l")){
                a = i;
                String[] arra = new String[a];
                 for(int j = 0 ; j < a;j++){
            arra[j] = str_list[j];
            
        } return arra; 
            } else if(str_list[i].equals("r")){
                b = i;
                String[] arrb = new String[str_list.length-b-1];
                for(int j = 0 ; j<str_list.length-b-1;j++){
                arrb[j] = str_list[j+b+1];
            } return arrb;
                
        }
    } return new String[0];
}
}