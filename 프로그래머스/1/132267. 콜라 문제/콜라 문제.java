class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int bottle = 0;
        while (n >= a){
            bottle = (n/a)*b;
            answer += bottle;
            n = n%a + bottle;
        }
        
        return answer;
    }
}