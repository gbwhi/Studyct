class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int num = 0;
        if(a==1){
            num =b-1;
        }else if(a==2){
            num =b-1+31;
        }else if(a==3){
            num =b-1+31+29;
        }else if(a==4){
            num =b-1+31+29+31;
        }else if(a==5){
            num =b-1+31+29+31+30;
        }else if(a==6){
            num =b-1+31+29+31+30+31;
        }else if(a==7){
            num =b-1+31+29+31+30+31+30;
        }else if(a==8){
            num =b-1+31+29+31+30+31+30+31;
        }else if(a==9){
            num =b-1+31+29+31+30+31+30+31+31;
        }else if(a==10){
            num =b-1+31+29+31+30+31+30+31+31+30;
        }else if(a==11){
            num =b-1+31+29+31+30+31+30+31+31+30+31;
        }else if(a==12){
            num =b-1+31+29+31+30+31+30+31+31+30+31+30;
        }
        if(num%7==0) answer = "FRI";
            else if(num%7==1) answer = "SAT";
        else if(num%7==2) answer = "SUN";
        else if(num%7==3) answer = "MON";
        else if(num%7==4) answer = "TUE";
        else if(num%7==5) answer = "WED";
        else if(num%7==6) answer = "THU";
        
        return answer;
    }
}