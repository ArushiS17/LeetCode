class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum= 0, rsum = 0;
        
        int n= cardPoints.length;
        for(int i=0; i<k; i++){
            lsum = lsum + cardPoints[i];
        }
        int maxSum= lsum;
        for(int i =0; i< k; i++){
            lsum = lsum - cardPoints[k-1-i];
            rsum = rsum + cardPoints[n-1-i];
            maxSum = Math.max(maxSum, lsum + rsum);
        }
        return maxSum;
    }
}