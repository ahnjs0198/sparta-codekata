import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        String REGEXP_PATTERN_NUMBER = "^[\\d]*$";
        boolean isNumber = Pattern.matches(REGEXP_PATTERN_NUMBER, s);
        boolean isLength = false;
        if(s.length()==4 || s.length()==6){
            isLength = true;
        }
        
        return isNumber && isLength;
    }
}