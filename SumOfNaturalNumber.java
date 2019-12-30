 public int sumOfNaturalNumber(int n) {
        if (n <= 0) {
            return n;
        }
        return n + sumOfNaturalNumber(n - 1);
    }
