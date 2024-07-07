class Solution {
    private void FindCombi(int ind, int[]arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind == arr.length){
            if(target== 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //pick condition
        if(arr[ind]<= target){
            ds.add(arr[ind]);
            FindCombi(ind, arr, target-arr[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        FindCombi(ind+1, arr, target,ans,ds); //not pick
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        FindCombi(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}