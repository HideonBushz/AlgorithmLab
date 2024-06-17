package org.algorithm.example.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class E_8移除元素 {
    public static void main(String[] args) {

    }


    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                intArr.add(nums[i]);
        }
        for (int i = 0; i < intArr.size(); i++) {
            nums[i] = intArr.get(i);
        }

        return intArr.size();

    }
}
