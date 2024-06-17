package org.algorithm.example.easy;

public class E_9找出字符串中第一个匹配项的下标 {
    public static void main(String[] args) {

        System.out.println(strStr("abcdefg", "efg"));

    }

    public static int strStr(String haystack, String needle) {
        int inex = -1;
        if (haystack == null || needle == null) {
            return -1;
        }
        while (true) {
            inex++;

            if (haystack.substring(inex).startsWith(needle)) {
                break;
            }


            if (inex > haystack.length() - needle.length()) {
                return -1;
            }

        }


        return inex;

    }
}
