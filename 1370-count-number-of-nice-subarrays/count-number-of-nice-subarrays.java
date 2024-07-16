class Solution {
    public int fn (int nums[], int goal){
        int l=0, r=0, sum=0, cnt=0;
        int n = nums.length;
        if(goal<0) return 0;
        while(r<n){
            sum += nums[r] % 2;
            while(sum > goal){
                sum -= nums[l] % 2;
                l= l+1;
            }
            cnt = cnt + (r-l+1);
            r= r+1;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return fn(nums, k) - fn(nums, k-1);
    }
}