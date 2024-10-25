import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        k = k-1;
        int[] answer = new int[score.length];

        int j = 0;
        for (int i=0; i<score.length; i++){
            list.add(score[i]);
            Collections.sort(list);

            if(j<k){
                answer[i] = list.get(list.size()-j-1);
                j++;
            } else {
                answer[i] = list.get(list.size()-k-1);
            }
        }
        return answer;
    }
}