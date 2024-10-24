import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();

        int j = 0;
        for (int[] element : commands){
            list.clear();
            for (int i=element[0]-1; i<element[1]; i++){
                list.add(array[i]);
            }
            Collections.sort(list);
            answer[j] = list.get(element[2]-1);
            j++;
        }
        return answer;
    }
}