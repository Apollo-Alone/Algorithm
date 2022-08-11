package com.ex.user.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 假设爬楼梯需要n阶才能到达楼顶
 * 每次可以爬1或者2阶，可以有多少种不同的方式才能爬到楼顶
 */
public class Climb {
    public static void main(String[] args) {
        System.out.println(looper(20));
    }


    /**
     * 递归法
     * 时间复杂度 O(n2)
     *
     * @param n 多少阶楼梯
     * @return
     */
    public static int recursion(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return recursion(n - 1) + recursion(n - 2);
    }


    /**
     * 递归法优化
     * 时间复杂度 O(n)
     *
     * @param n 多少阶楼梯
     * @return
     */
    public static int recursionO(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (null != map.get(n)) {
            return map.get(n);
        } else {
            int result = recursion(n - 1) + recursion(n - 2);
            map.put(n, result);
            return result;
        }
    }

    /**
     * 循环解法 由底向上累加
     * 时间复杂度 O(n)
     * @param n 多少阶楼梯
     * @return
     */
    public static int looper(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int result = 0;
        int pre = 2;
        int prePre = 1;
        for (int i = 3; i <= n; i++) {
            result = pre + prePre;
            prePre = pre;
            pre = result;
        }
        return result;
    }
}
