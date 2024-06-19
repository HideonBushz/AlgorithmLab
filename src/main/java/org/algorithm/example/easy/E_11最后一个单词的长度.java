package org.algorithm.example.easy;

public class E_11最后一个单词的长度 {
    public static void main(String[] args) {

    }

    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        return s1[s1.length - 1].length();

    }
}
