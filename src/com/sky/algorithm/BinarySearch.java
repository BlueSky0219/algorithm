package com.sky.algorithm;

/**
 * 二分查找
 */
public class BinarySearch {

    /**
     * 基础二分查找
     *
     * @param a      数组
     * @param target 目标值
     * @return 找到返回索引，未找到返回-1
     */
    public static int binarySearchBasic(int[] a, int target) {

        // 初始化
        int i = 0; // 左边界
        int j = a.length - 1; // 右边界

        while (i <= j) {

            int m = (i + j) / 2; // 中间索引
            if (target < a[m]) {
                j = m - 1;
            } else if (target > a[m]) {
                i = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }

    

    public static void main(String[] args) {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};

        int result = binarySearchBasic(a, 8);

        System.out.println("result = " + result);
    }
}
