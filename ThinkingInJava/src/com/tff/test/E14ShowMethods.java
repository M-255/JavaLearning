package com.tff.test;
/*
 * @author 马战川
 * @date 2018/10/9 09:32
 * @description
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author 马战川
 * @version 1.0
 * @className E14ShowMethods
 * @date 2018/10/9 9:32
 * @description TODO
 */
public class E14ShowMethods {
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
//        args = new String[]{"com.tff.test.E14ShowMethods"};
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();
            for (Method method : methods) {
//                    System.out.println(method.toString());
                System.out.println(p.matcher(method.toString()).replaceAll(""));
            }
            for (Constructor constructor : constructors) {
//                    System.out.println(constructor.toString());
                System.out.println(p.matcher(constructor.toString()).replaceAll(" "));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
