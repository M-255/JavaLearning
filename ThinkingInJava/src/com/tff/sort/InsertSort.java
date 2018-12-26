package com.tff.sort;
/*
 * @author 马战川
 * @date 2018/12/26 14:37
 * @description
 */

import java.util.Arrays;

/**
 * @author 马战川
 * @version 1.0
 * @description
 * @className InsertSort
 * @date 2018/12/26 14:37
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 6, 5, 7, 6, 9, 11, 2, 6};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        // 判断传参是否合理
        if (arr == null || arr.length < 2) {
            return;
        }
        // 取出长度
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            // 取出要插入的数
            int target = arr[i];
            // 已经排序的个数
            int j = i - 1;
            // 从后往前比较
            while (j >= 0 && target < arr[j]) {
                // 往后移动一个
                arr[j + 1] = arr[j];
                j--;
            }
            // 将要插入的数放入正确位置
            arr[j + 1] = target;
        }

    }

}
