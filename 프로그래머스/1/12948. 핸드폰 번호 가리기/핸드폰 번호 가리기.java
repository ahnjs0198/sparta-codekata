class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for (int i=0; i<phone_number.length()-4; i++){
            answer = answer + "*";
        }
        for (int i=phone_number.length()-4; i<phone_number.length(); i++){
            answer = answer + phone_number.charAt(i);
        }
        return answer;
    }
}