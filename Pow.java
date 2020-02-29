class Solution {
    public double myPow(double x, int n) {
       long N = n;
        if(n < 0) {
            x = 1/x;
            N = Math.abs(n);
        }
        return pow( x,  N);
    }
    private double pow(double x, long n) {
        if(n == 0){
            return 1.0;
        } else {
            double half = pow(x, n/2);
            if(n % 2 == 0) {
                return half*half;
            } else {
                return x * half * half;
            }
        }
    }
}
