public static void main(String[] args) {
        Main obj = new Main();
        int[] A = {1, 8, 9};

        int res = obj.sum(A, A.length - 1, A[A.length - 1]);
        System.out.println(res);
    }


    int sum(int[] A, int size, int sum) {
        if (size == 0) {
            return sum;
        }

        return sum(A, size - 1, sum + A[size-1]);
    }
