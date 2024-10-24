class Solution {
    public int[] solution(int n, int m) {
        int gcd = 1;
        int lcm = 1;
        for (int i=1; i<=n; i++){
            if(n%i==0 && m%i==0){
                gcd = i;
            }
        }
        lcm = n*m/gcd;
        int[] answer = {gcd, lcm};
        return answer;
    }
}