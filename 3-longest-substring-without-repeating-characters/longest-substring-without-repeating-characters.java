class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int maxlen = 0;
        int [] hash = new int [256]; //array to see last seen positions
        for(int i =0; i<256; i++){
            hash[i] = -1; //initialise hadh array with -1
        }

        while(r<n){
            if(hash[s.charAt(r)]!= -1){ // if character at r is seen
                if(hash[s.charAt(r)]>= l){ //if lastseen position is within window, move left pointer to right of last seen position (next step)
                    l = hash[s.charAt(r)]+1; //moves left pointer to right of last seen
                }
            }
            int len = r-l+1; //window size
            maxlen= Math.max(len, maxlen);
            hash[s.charAt(r)] = r; //updates last seen position
            r++;
        }
        return maxlen;
    }
}