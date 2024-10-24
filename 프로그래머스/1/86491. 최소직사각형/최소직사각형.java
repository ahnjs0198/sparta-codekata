class Solution {
    public int solution(int[][] sizes) {
        for (int i=0; i<sizes.length; i++){
            if (sizes[i][0]>sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int hMax = 0;
        int wMax = 0;
        for(int[] n: sizes){
            wMax = Math.max(wMax,n[0]);
            hMax = Math.max(hMax,n[1]);
        }
        
        return hMax*wMax;
    }
}