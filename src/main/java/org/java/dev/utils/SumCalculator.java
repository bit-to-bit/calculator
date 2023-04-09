package org.java.dev.utils;

public class SumCalculator {
    public int sum(int n) {
        int res = 0;
        if (n <= 0 || n > 65535) {
            throw new IllegalArgumentException(n + " is not in range [1,..,65535]");
        }
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        return res;
    }
}