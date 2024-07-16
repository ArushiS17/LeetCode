class Solution {
    public int fn (int nums[], int goal){
        int l=0, r=0, sum=0, cnt=0;
        int n = nums.length;
        if(goal<0) return 0;
        while(r<n){
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l= l+1;
            }
            cnt = cnt + (r-l+1);
            r= r+1;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return fn(nums, goal) - fn(nums, goal-1);
    }

}