package org.algorithm.example.easy;

import java.util.ArrayList;

public class E_3罗马数字转整数 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int nums = 0;
        ArrayList<String> arrs = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                arrs.add(String.valueOf(1));
            } else if (c == 'V') {
                arrs.add(String.valueOf(5));

            } else if (c == 'X') {
                arrs.add(String.valueOf(10));

            } else if (c == 'L') {
                arrs.add(String.valueOf(50));

            } else if (c == 'C') {
                arrs.add(String.valueOf(100));

            } else if (c == 'D') {
                arrs.add(String.valueOf(500));

            } else if (c == 'M') {
                arrs.add(String.valueOf(1000));

            }
        }

        for (int i = 0; i < arrs.size(); i++) {
            if (i < arrs.size() - 1 && Integer.valueOf(arrs.get(i)) < Integer.valueOf(arrs.get(i + 1))) {
                nums -= Integer.valueOf(arrs.get(i));

            } else
                nums += Integer.valueOf(arrs.get(i));
        }
        return nums;
    }
}
