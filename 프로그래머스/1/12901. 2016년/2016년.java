import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        Map<Integer, String> days = new HashMap<Integer, String>();
        days.put(0, "THU");
        days.put(1, "FRI");
        days.put(2, "SAT");
        days.put(3, "SUN");
        days.put(4, "MON");
        days.put(5, "TUE");
        days.put(6, "WED");

        if (a == 1){
            answer = days.get(b%7);
        } else if (a == 2){
            answer = days.get((b+3)%7);
        } else if (a == 3){
            answer = days.get((b+4)%7);
        } else if (a == 4){
            answer = days.get(b%7);
        } else if (a == 5){
            answer = days.get((b+2)%7);
        } else if (a == 6){
            answer = days.get((b+5)%7);
        } else if (a == 7){
            answer = days.get(b%7);
        } else if (a == 8){
            answer = days.get((b+3)%7);
        } else if (a == 9){
            answer = days.get((b+6)%7);
        } else if (a == 10){
            answer = days.get((b+1)%7);
        } else if (a == 11){
            answer = days.get((b+4)%7);
        } else if (a == 12){
            answer = days.get((b+6)%7);
        }
        return answer;
    }
}