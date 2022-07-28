package com.ex.user;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(twoSumMap(nums, 18)[0]);
        System.out.println(twoSumMap(nums, 18)[1]);
    }

    /**
     * 暴力2层循环  时间复杂度 O(n2)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }


    /**
     * 引入一个HashMap 避免2次循环
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumMap(int[] nums, int target) {
        //key为元素 value为每个元素的下标值
        Map<Integer, Integer> map = new HashMap<>(nums.length, 1);
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            //查看差目标值多少
            int another = target - nums[i];
            Integer anotherIndex = map.get(another);
            if (null != anotherIndex){
                result[0] = anotherIndex;
                result[1] = i;
                break;
            }else {
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
