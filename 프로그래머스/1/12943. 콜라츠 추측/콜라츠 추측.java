class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while (answer < 500){
            if(n%2 == 0){
                n /= 2;
                answer++;
            } else if (n == 1){
                break;
            } else {
                n = n*3 +1;
                answer++;
            }
        }
        if (answer >= 500){
            answer = -1;
        }
        return answer;
    }
}