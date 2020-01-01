public int TaylorSeries(int x, int n) {
        // Power
        int P = 1;
        // Factorial
        int F = 1;
        if (n == 0) {
            return 1;
        }
        int r = TaylorSeries(x, n - 1);
        P = P * x;
        F = F * n;
        return (r + P / F);
    }
