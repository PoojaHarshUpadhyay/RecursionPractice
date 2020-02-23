 public static void main(String[] args) {
        Main obj = new Main();
        char[] str = {'a', 'b', 'c'};
        obj.printReverse(str);
    }

    void printReverse(char[] str) {
        helper(0, str);
    }

    void helper(int i, char[] str) {
        if (str == null || i >= str.length) {
            return;
        }
        helper(i + 1, str);
        System.out.println(str[i]);
    }
