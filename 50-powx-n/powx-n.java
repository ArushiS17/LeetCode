class Solution {
    public double myPow(double x, int n) {
        double ans =1;
        long m = n;
        if(m<0) m = -1*m; //make positive
        while(m>0){
            if(m%2 == 1){
                ans = ans * x;
                m= m-1;
            }
            else{
                x= x*x;
                m=m/2;
            }
        }
        if(n<0) ans = (double) 1 / (double) ans;
        return ans;
    }
}