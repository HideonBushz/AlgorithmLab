package org.algorithm.example.order;

public class 冒泡排序 {
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] nums = {100, 1000, 1, 99, 20, 10, 5, 100};
        printArray(bubbleSort(nums));

    }


    public static int[] bubbleSort(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j + 1] < nums[j])
//                    swap(nums, j, j + 1);
                {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }


    public static void printArray(int nums[]) {
        for (int n = 0; n < nums.length; n++) {
            System.out.println(nums[n]);
        }

    }
}


