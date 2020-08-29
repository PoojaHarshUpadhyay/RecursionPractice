package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        int res = obj.fibonaci(3);
        System.out.println(res);
    }

    Map<Integer, Integer> memo = new HashMap<>();

    public int fibonaci(int n) {
        //invalid n
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        //base condition
        if (n == 0 || n == 1) {
            return n;
        }

        //check if already calculated
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fibonaci(n - 1) + fibonaci(n - 2);

        //memoize
        memo.put(n, result);

        return result;
    }

}
