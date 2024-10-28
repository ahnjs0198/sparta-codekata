class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i=1; i<=number; i++){
            int count = countPower(i);
            answer += (count>limit) ? power : count;
        }
        return answer;
    }
    public int countPower (int num){
        int count = 0;
        for (int j = 1; j <= (int) Math.sqrt(num); j++){
            if (num % j == 0){
                count += 2;
            }
            if (j * j == num){
                count -= 1;
            }
        }
        return count;
    }
}