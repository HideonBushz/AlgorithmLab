package org.algorithm.example.easy;

import java.util.ArrayList;

public class E_5有效的括号 {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     * <p>
     * 有效字符串需满足：
     * <p>
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 每个右括号都有一个对应的相同类型的左括号。
     **/
    public static void main(String[] args) {
//        String s = "()[]{}";
//        String s = "{[]}";
        String s = "(){}}{";
        System.out.println(isValid(s));
    }


    public static boolean isValid(String s) {
        if (s.length() % 2 == 1 || s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) {
            return false;
        }

        ArrayList<String> arrs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                arrs.add(String.valueOf(s.charAt(i)));
            }
            if (s.charAt(i) == ')') {
                if (!arrs.isEmpty() && arrs.get(arrs.size() - 1).equals("(")) {
                    arrs.remove(arrs.size() - 1);
                } else {
                    return false;
                }

            }

            if (s.charAt(i) == ']') {
                if (!arrs.isEmpty() && arrs.get(arrs.size() - 1).equals("[")) {
                    arrs.remove(arrs.size() - 1);
                } else {
                    return false;
                }

            }


            if (s.charAt(i) == '}') {
                if (!arrs.isEmpty() && arrs.get(arrs.size() - 1).equals("{")) {
                    arrs.remove(arrs.size() - 1);
                } else {
                    return false;
                }

            }

        }

        if (arrs.isEmpty())
            return true;

        return false;
    }
}
