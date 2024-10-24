import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        answer = new int[set.size()];
        int j = 0;
        for(Integer s : set) {
            answer[j++] = s;
        }
        Arrays.sort(answer);
        return answer;
    }
}