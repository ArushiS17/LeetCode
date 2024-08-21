class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        int nge[] =new int [n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(nge, -1);
        int k= n-1;

        for(int i=2*n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<= nums[i%n]){
                st.pop();
            }
            if(!st.isEmpty() && i<n){
                nge[i] = st.peek();
            }
            st.push(nums[i%n]);

        }
        return nge;
    }
}