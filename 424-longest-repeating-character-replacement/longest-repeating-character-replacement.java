class Solution {
    public int characterReplacement(String s, int k) {
        int l=0, r=0, maxlen=0, maxf=0;
        int hash[] = new int [26];
        int n = s.length();

        while(r<n){
            hash[s.charAt(r)- 'A']++;
            maxf= Math.max(maxf, hash[s.charAt(r)-'A']);
            if((r-l+1)-maxf>k){
                hash[s.charAt(l)-'A']--;
                l++;

                maxf=0;
                for(int i=0; i<25; i++){
                    maxf= Math.max(maxf, hash[i]);
                }
                }
                 maxlen = Math.max(maxlen, (r-l+1));
                    r++;
            }
            return maxlen;
        }
        
    }
