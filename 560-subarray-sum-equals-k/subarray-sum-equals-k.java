class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int n= nums.length;
        int presum = 0, cnt=0;
        for(int i=0; i<n; i++){
            presum += nums[i];
            int rem = presum-k;
            if(mpp.containsKey(rem)){
                cnt+=mpp.get(rem);
            }
            mpp.put(presum, mpp.getOrDefault(presum, 0)+1);
        }
        return cnt;
    }
}