package com.tff.systemenv;
/*
 * @author 马战川
 * @date 2018/9/19 10:44
 * @description
 */

/**
 * @author 马战川
 * @version 1.0
 * @className SystemEnv
 * @date 2018/9/19 10:44
 * @description 获取系统环境变量
 */
public class SystemEnv {
    public static void main(String[] args) {
        System.getenv().forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
