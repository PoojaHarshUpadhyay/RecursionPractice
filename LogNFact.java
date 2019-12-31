 public double fact(int n) {
        if (n == 1) {
            return 0;
        }
        return  fact(n - 1) + Math.log(n) ;
    }
