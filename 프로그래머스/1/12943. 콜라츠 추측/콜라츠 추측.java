class Solution {
    public int solution(int num) {
        int answer = 0;
        while (answer < 500){
            if(num%2 == 0){
                num /= 2;
                answer++;
            } else if (num == 1){
                break;
            } else {
                num = num*3 +1;
                answer++;
            }
        }
        if (answer >= 400){
            answer = -1;
        }
        return answer;
    }
}