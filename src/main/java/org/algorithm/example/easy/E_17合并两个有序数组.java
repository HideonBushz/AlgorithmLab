package org.algorithm.example.easy;

public class E_17合并两个有序数组 {
    public static void main(String[] args) {
        int[] nums1 = {-1, 3, 0, 0, 0, 0, 0};
        int[] nums2 = {0, 0, 1, 2, 3};
        merge(nums1, 2, nums2, 5);


        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n > 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
            return;

        }

        for (int i = 0; i < m + n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[i] > nums2[j] || (nums1[i] == 0 && nums2[j] >= nums1[i] && i >= m)) {
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
                }

            }

        }

    }

}
