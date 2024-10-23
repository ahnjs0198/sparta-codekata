import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] list = new int[arr.length];
        Arrays.sort(arr);
        int j = 0;

        for (int k : arr) {
            if (k % divisor == 0) {
                list[j] = k;
                j++;
            }
        }
        
        if(j==0){
            list[j]= -1;
            j++;
        }
        int[] answer = Arrays.copyOf(list, j);
        return answer;
    }
}