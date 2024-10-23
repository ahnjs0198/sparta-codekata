class Solution {
    public int[] solution(int[] arr) {
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
        if (arr.length==1){
            int [] a = {-1};
            return a;
        } else {
            return answer;
        }
    }
}