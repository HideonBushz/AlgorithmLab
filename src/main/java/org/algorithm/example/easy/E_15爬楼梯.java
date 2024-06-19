package org.algorithm.example.easy;

import java.util.ArrayList;

public class E_15爬楼梯 {

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }


    public static int climbStairs(int n) {
        ArrayList<Integer> arrs = new ArrayList<>();
        arrs.add(0);
        arrs.add(1);
        arrs.add(2);

        if (n <= 3)
            return arrs.get(n);

        for (int i = 3; i <= n; i++) {
            arrs.add(arrs.get(i - 2) + arrs.get(i - 1));
        }
        return arrs.get(n);
    }
}
