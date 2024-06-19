package org.algorithm.example.easy;

public class E_13二进制求和 {
    public static void main(String[] args) {

        System.out.println(addBinary("1111", "1111"));


    }

    public static String addBinary(String a, String b) {
        int i = Integer.parseInt(a, 2);
        int j = Integer.parseInt(b, 2);
        return Integer.toBinaryString(i + j) + "";

    }


    public static String addBinary1(String a, String b) {
        if (a.equals("0") && b.equals("0")) return "0";
        int max = Math.max(a.length(), b.length());
        boolean flag = false;
        StringBuffer strWord = new StringBuffer();

        for (int i = 0; i <= max; i++) {
            String suba = i < a.length() ? new StringBuffer(a).reverse().substring(i, i + 1) : "0";
            String subb = i < b.length() ? new StringBuffer(b).reverse().substring(i, i + 1) : "0";
            int tmpPlus = flag ? Integer.valueOf(suba) + Integer.valueOf(subb) + 1 : Integer.valueOf(suba) + Integer.valueOf(subb);

            if (flag) flag = false;
            if (tmpPlus >= 2) {
                strWord.append(tmpPlus % 2);
                flag = true;
            } else {
                strWord.append(tmpPlus);
            }
        }

        StringBuffer reverse = strWord.reverse();

        return reverse.toString().startsWith("0") ? reverse.deleteCharAt(0).toString() : reverse.toString();
    }
}
