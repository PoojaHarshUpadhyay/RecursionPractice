 public static void main(String[] args) {
       int res =  sum_of_digit(1234);
        System.out.println(res);
    }

    static int sum_of_digit(int n) {
        int res = 0;
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum_of_digit(n / 10);
    }
