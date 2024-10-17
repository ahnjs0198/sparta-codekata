class Solution {
    public int solution(int n) {
        int answer = 0;
        n = n/2;
        for (int i=0; i<=n; i++){
            answer += 2*i;
        }
        return answer;
    }
}