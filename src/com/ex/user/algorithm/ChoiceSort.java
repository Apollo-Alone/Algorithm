package com.ex.user.algorithm;

public class ChoiceSort {
    public static void main(String[] args) {
        int[] arr = {22, 66, 32, 54, 98, 77};
        int[] result =
                choiceSort(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] choiceSort(int[] nums) {
        if (nums == null) {
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;//假定第一个数为最小值
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;//将最小值的索引保存
                }
            }
            //交换最小值和i当前所指的元素
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
