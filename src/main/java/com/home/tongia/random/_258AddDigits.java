package com.home.tongia.random;

public class _258AddDigits {
    public static void main(String[] args) {
        int num = 38;
        System.out.println("Result of add digits : " + addDigits(num));
    }

    public int addDigitsOptimized(int num) {
        return num - 9 * ((num-1)/9);
    }

    private static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }

        while (num > 9) {
            int result = 0;

            while (num > 0) {
                result+=num%10;
                num /= 10;
            }

        num = result;

        }

        return num;

    }


}
