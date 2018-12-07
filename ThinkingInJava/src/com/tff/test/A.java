package com.tff.test;
/*
 * @author 马战川
 * @date 2018/10/15 14:43
 * @description
 */

/**
 * @author 马战川
 * @version 1.0
 * @className A
 * @date 2018/10/15 14:43
 * @description TODO
 */
public class A {
    private void b() {
        System.out.println("A.b()");
    }

    protected void d() {
        System.out.println("A.d()");
    }

    void e() {
        System.out.println("A.e()");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 2, 5, 4, 5, 8, 7, 8, 77, 88, 5, 4, 9, 6, 2, 4, 1, 5};
        int[] brr = new int[100];
        for (int anArr : arr) {
            brr[anArr]++;
        }
        for (int i = 0; i < brr.length; i++) {
            if (brr[i]!=0){
                System.out.println(i+"出现次数："+brr[i]);
            }
        }
    }
}
