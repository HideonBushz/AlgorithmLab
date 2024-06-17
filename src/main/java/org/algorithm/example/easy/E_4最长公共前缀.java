package org.algorithm.example.easy;


public class E_4最长公共前缀 {
    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"dog","racecar","car"};
        String[] strs = {"a","ab"};
//        String[] strs = {"flower","flower","flower","flower"};
//        String[] strs = {"aa","aa"};
        System.out.println(longestCommonPrefix(strs));


    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String str = "";
        String min_str = "";
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i].length() < strs[i + 1].length()) {
                min_str = strs[i];
            } else min_str = strs[i + 1];
        }

        for (int i = min_str.length(); i > 0; i--) {
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(min_str.substring(0, i ))) {
                    flag = false;
                    break;
                }


            }
            if (flag) {
                System.out.println(i);
                return min_str.substring(0, i);
            }

        }
        return str;

    }

}
