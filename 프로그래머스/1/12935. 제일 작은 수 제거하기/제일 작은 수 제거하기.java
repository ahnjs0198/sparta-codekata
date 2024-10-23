class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
          int[] answer = {-1};
          return answer;
        }
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int index = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(i!=index){
                answer[j] = arr[i];
                j++;
            }
        }
        return answer;
    }
}