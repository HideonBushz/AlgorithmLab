package org.algorithm.example.easy;

public class E_2回文数 {
    public static void main(String[] args) {
        int x = 121;
        int y = -121;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(y));
    }


    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        if (num.equals(new StringBuffer(num).reverse().toString())) {
            return true;
        }
        return false;
    }
}
