class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int matched = 0;
        int countZero = 0;
        for (int i=0; i<lottos.length; i++){
            for (int j=0; j<win_nums.length; j++){
                if (lottos[i]==win_nums[j]){
                    matched++;
                }
            }
        }
        for (int i=0; i<lottos.length; i++){
            if (lottos[i]==0){
                countZero++;
            }
        }
        int[] answer = {(matched+countZero==0) ? 6-(matched+countZero) : 7-(matched+countZero), 
                        (matched==0) ? 6-matched : 7-matched};
        return answer;
    }
}