class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start =0;
        int end =0;
        int max= 0;

        HashSet<Character> seen = new HashSet<>();
        while(end<s.length()){
            char c = s.charAt(end);
            while(seen.contains(c)){
                seen.remove(s.charAt(start));
                start+=1;
            }
            seen.add(c);
            int windowsize= end-start+1;
            max= Math.max(max, end-start+1);
            end += 1;
        }
        return max;
    }
}