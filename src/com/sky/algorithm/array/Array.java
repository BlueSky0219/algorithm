package com.sky.algorithm.array;

import java.util.Arrays;

/**
 * @author bluesky
 * @create 2023-10-21-11:06
 */
public class Array {

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

        removeDuplicates();
    }


}
