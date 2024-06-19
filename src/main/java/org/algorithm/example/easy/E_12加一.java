package org.algorithm.example.easy;

public class E_12加一 {
    public static void main(String[] args) {
        int[] a = {9};
        plusOne(a);
    }


    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        boolean flag = true;
        while (index >= 0) {
            //当前加1
            if (flag) {
                digits[index] = digits[index] + 1;
                flag = false;
            }

            //判断是否需要往前推
            if (String.valueOf(digits[index]).length() > 1) {
                flag = true;
                digits[index] = 0;

            }

            index--;

        }


        if (digits[0] == 0) {
            int[] newArr = new int[digits.length + 1];
            int[] tmp1Arr = {1, 0};
            System.arraycopy(tmp1Arr, 0, newArr, 0, 1);

            return newArr;
        }


        return digits;
    }
}
