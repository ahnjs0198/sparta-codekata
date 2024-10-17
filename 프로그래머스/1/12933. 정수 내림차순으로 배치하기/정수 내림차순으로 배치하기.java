import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = ""+n;
        int [] digits = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            digits[i] = a.charAt(i) - '0';
        }

        Arrays.sort(digits);
        long tens = 1;
        for (int digit : digits) {
            answer += digit * tens;
            tens *= 10;
        }
        return answer;
    }
}