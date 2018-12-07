package com.tff.sort;
/*
 * @author 马战川
 * @date 2018/11/26 19:48
 * @description
 */

import java.util.Arrays;

/**
 * @author 马战川
 * @version 1.0
 * @className SimpleSort
 * @date 2018/11/26 19:48
 * @description 简单排序(选择排序)
 */
public class Sort {
    public static void main(String[] args) {
        int[] target = new int[]{10, 2, 5, 7, 8, 0, 4, 3};
//        simpleSort(target);
        bubbleSort(target);
        System.out.println(Arrays.toString(target));
    }

    //快速排序
    static void partitionSort(int[] target) {
        int low = 0;
        int high = target.length;
        int mid = target.length / 2;
        // TODO: 2018/11/26  

    }

    //冒泡排序
    static void bubbleSort(int[] target) {
        for (int i = 0; i < target.length - 1; i++) {
            for (int j = 0; j < target.length - i - 1; j++) {
                if (target[j] > target[j + 1]) {
                    int temp = target[j];
                    target[j] = target[j + 1];
                    target[j + 1] = temp;
                }
            }
        }
    }

    //选择排序
    static void simpleSort(int[] target) {
        for (int i = 0; i < target.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < target.length; ++j) {
                if (target[min] > target[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = target[i];
                target[i] = target[min];
                target[min] = temp;
            }
        }

    }

}
