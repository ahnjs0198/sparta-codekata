class Solution {
    public int[] solution(long n) {
        int size = 0;
        long num = n;
        while(num!=0){
            num = num/10;
            size++;
        }
        int[] answer = new int[size];
        for(int i=0; i<size; i++){
            answer[i] = (int) (n%10);
            n = n/10;
        }
        return answer;
    }
}