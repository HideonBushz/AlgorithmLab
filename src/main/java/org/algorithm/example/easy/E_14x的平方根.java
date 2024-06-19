package org.algorithm.example.easy;

public class E_14x的平方根 {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }


    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        for (int i = 0; i <= x; i++) {
            if (i == 46340) {
                return 46340;
            }
            if (x >= (i * i) && ((i + 1) * (i + 1)) > x) {

                return i;
            }

        }
        return -1;
    }
}
