package org.algorithm.example.easy;

import org.algorithm.example.common.CommonUtils;

public class E_1两数之和 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] arrs = twoSum(nums, target);
        CommonUtils.printArray(arrs);

    }


    public static int[] twoSum(int[] nums, int target) {
        int index_1 = -1;
        int index_2 = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index_1 = i;
                    index_2 = j;
                }

            }

        }


        return new int[]{index_1, index_2};

    }
}
