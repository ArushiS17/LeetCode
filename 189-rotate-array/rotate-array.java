class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k= k % n;
        reverse(nums, 0, n-k-1); //first k
        reverse(nums, n-k, n-1); //last k
        reverse(nums, 0, n-1);
    }
   
    public void reverse(int [] nums, int start, int end){
        while(start<=end){
        int temp= nums[start];
        nums[start]= nums[end];
        nums[end]= temp;
        start++;
        end--;
        }
       
    }
}