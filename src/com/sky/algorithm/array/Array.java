package com.sky.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bluesky
 * @create 2023-10-21-11:06
 */
public class Array {

    /**
     * 35. 搜索插入位置
     * 二分查找
     */
    public static void searchInsert() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                System.out.println("middle = " + middle);
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        // 这个程序返回left或者right+1正好等于答案
        System.out.println(left);
    }

    /**
     * 27. 移除元素
     */
    public static void removeElement() {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
            nums[i] = 999;
        }

        int result = 0;
        for (Integer l : list) {
            nums[result] = l;
            result++;
        }
        System.out.println("result = " + result);
    }

    /**
     * 26. 删除有序数组中的重复项
     * 双指针
     */
    public static void removeDuplicates() {
        int[] nums = {1};

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    nums[i + 1] = nums[j];
                    i++;
                    result = i;
                }
                if (j == nums.length - 1) {
                    System.out.println(result + 1);
                    break;
                }
            }
            break;
        }

    }

    /**
     * 1.两数之和
     */
    public static void twoSum() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }

            }
        }

        System.out.println(Arrays.toString(result));
    }


    public static void main(String[] args) {

        searchInsert();
    }


}
