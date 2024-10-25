class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                for(int k=0; k<j; k++){
                    boolean flag = true;
                    sum = nums[i]+nums[j]+nums[k];
                    if(isPrime(sum)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    public boolean isPrime (int sum){
        boolean flag = true;
        for(int s=2; s<sum; s++){
            if(sum%s==0){
                flag = false;
            }
        }
        return flag;
    }
}