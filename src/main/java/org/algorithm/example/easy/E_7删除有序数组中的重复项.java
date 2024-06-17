package org.algorithm.example.easy;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class E_7删除有序数组中的重复项 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(removeDuplicates(arr));

    }


    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> arrs = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!arrs.contains(nums[i])) {
                arrs.add(nums[i]);
                nums[index++] = nums[i];
            }
        }

        for (int i = 0; i < arrs.size(); i++) {
            nums[i] = arrs.get(i);

        }


        return arrs.size();
    }
}
